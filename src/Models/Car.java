package Models;

public class Car extends  vehicle {


    public Car(String NAME) {
        super(NAME);
    }

    @Override
    public int GetFixTime() {
        return 5;
    }

    @Override
    public void fixed() {
        System.out.println("Car: " +  name+" brakes have been fixed");
    }
}
