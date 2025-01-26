package Models;

public class Car extends  Vehicle {

    private  final  int FIxtime=5;
    public Car(String NAME) {
        super(NAME);
    }

    @Override
    public int GetFixTime() {
        return FIxtime;
    }

    @Override
    public void fixed() {
        System.out.println("Car: " +  name+" brakes have been fixed");
    }
}
