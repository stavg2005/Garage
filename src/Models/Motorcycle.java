package Models;

public class Motorcycle extends vehicle{
    public Motorcycle(String NAME) {
        super(NAME);
    }

    @Override
    public int GetFixTime() {
        return 3 ;
    }

    @Override
    public void fixed() {
        System.out.println("Motorcycle: "+ name+" wheels have been fixed");
    }
}
