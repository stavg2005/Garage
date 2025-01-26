package Models;

import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GarageLib {
    private int counter = 0;
    private int index = 0;
    private final Protocol_Garage protocol;
    private final ArrayList<Vehicle> vehicles;
    private ScheduledExecutorService executor;

    public GarageLib(Protocol_Garage protocol, ArrayList<Vehicle> vehicles) {
        this.protocol = protocol;
        this.vehicles = vehicles;
    }

    // Starts the timer for processing vehicles
    public void start() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles to process.");
            return;
        }

        System.out.println(vehicles.get(0).getName() +" is now being fixed");
        counter = vehicles.get(index).GetFixTime();

        executor = Executors.newScheduledThreadPool(1);
        executor.scheduleAtFixedRate(this::tick, 0, 1, TimeUnit.SECONDS);
    }

    private void tick() {
        if (index >= vehicles.size()) {
            stopTimer();
            return;
        }

        counter--;

        if (counter <= 0) {
            FixDetected();
        }
    }


    private void FixDetected() {
        protocol.fixed(vehicles.get(index));
        index++;


        if (index < vehicles.size()) {
            counter = vehicles.get(index).GetFixTime();
            System.out.println(vehicles.get(index).getName() +" is now being fixed");
        } else {
            stopTimer();
        }
    }


    private void stopTimer() {
        if (executor != null && !executor.isShutdown()) {
            executor.shutdown();
            System.out.println("Timer stopped. All vehicles processed.");
        }
    }
}
