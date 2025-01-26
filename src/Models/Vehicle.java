package Models;

public abstract class Vehicle implements Fixable {

    protected  String name;

    public   abstract  int GetFixTime();
public Vehicle(String NAME){
    name = NAME;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
