package Models;

public class Motorcycle extends Vehicle{

    private  final  int FIxtime=3;
    public Motorcycle(String NAME) {
        super(NAME);
    }

    @Override
    public int GetFixTime() {
        return FIxtime ;
    }

    @Override
    public void fixed() {
        System.out.println("Motorcycle: "+ name+" wheels have been fixed");
    }
}
