package Models;

import java.util.ArrayList;

public class DB {
    private ArrayList<vehicle> Vehicles;

    public  DB(ArrayList<vehicle> v){
        Vehicles =v;
    }

    public  DB (){
        Vehicles = new ArrayList<>();
    }

    public  void AddVehicle(vehicle v){
        Vehicles.add(v);
    }

    public  ArrayList<vehicle> GetArray(){
        return  Vehicles;
    }
}
