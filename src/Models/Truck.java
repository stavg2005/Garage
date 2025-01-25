package Models;

public class Truck extends  vehicle{
    public Truck(String NAME) {
        super(NAME);
    }

    @Override
    public int GetFixTime() {
        return 10;
    }

    @Override
    public void fixed() {
        System.out.println("Truck: " + name+" Engine has been fixed");
    }
}
