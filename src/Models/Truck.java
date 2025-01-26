package Models;

public class Truck extends  Vehicle{
    private  final  int FIxtime=10;
    public Truck(String NAME) {
        super(NAME);
    }

    @Override
    public int GetFixTime() {
        return FIxtime;
    }

    @Override
    public void fixed() {
        System.out.println("Truck: " + name+" Engine has been fixed");
    }
}
