package Data;

import Models.Vehicle;

import java.util.ArrayList;

public class DB {
    private ArrayList<Vehicle> vehicles;

    public  DB(ArrayList<Vehicle> v){
        vehicles =v;
    }

    public  DB (){
        vehicles = new ArrayList<>();
    }

    public  void AddVehicle(Vehicle v){
        vehicles.add(v);
    }

    public  ArrayList<Vehicle> GetArray(){
        return  vehicles;
    }
}
