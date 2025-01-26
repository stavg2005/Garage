package Models;

import Data.DB;

import java.util.Scanner;

public class MainScreen {
    private final Scanner scanner = new Scanner(System.in);
    private final DB manager = new DB();

    private static Protocol_Garage protocolGarage = new Protocol_Garage() {
        @Override
        public void fixed(Vehicle v) {
            v.fixed();
        }
    };

    public  void start() {
        System.out.println("Welcome to the Vehicle Management System!");
        while (true) {
            System.out.println("\nPlease choose the type of vehicle:");
            System.out.println("1 - Car\n2 - Truck\n3 - Motorcycle\n-1 - Exit");
            System.out.print("Your choice: ");

            int vehicleType = getUserInputAsInt();

            if (vehicleType == -1) {
                System.out.println("Exiting... Thank you!");
                break;
            }

            System.out.print("Enter the vehicle name: ");
            String name = scanner.nextLine();

            switch (VehicleType.fromInt(vehicleType)) {
                case CAR -> manager.AddVehicle(new Car(name));
                case TRUCK -> manager.AddVehicle(new Truck(name));
                case MOTORCYCLE -> manager.AddVehicle(new Motorcycle(name));
                default -> System.out.println("Invalid vehicle type! Please try again.");
            }
        }

        GarageLib g = new GarageLib(protocolGarage,manager.GetArray());
        System.out.println("starting to fix vehicles \n");

        g.start();
    }

    private int getUserInputAsInt() {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid input! Please enter a valid number.");
            return -2;
        }
    }

    private enum VehicleType {
        CAR(1), TRUCK(2), MOTORCYCLE(3);

        private final int value;

        VehicleType(int value) {
            this.value = value;
        }

        public static VehicleType fromInt(int value) {
            for (VehicleType type : values()) {
                if (type.value == value) {
                    return type;
                }
            }
            return null;
        }
    }
}
