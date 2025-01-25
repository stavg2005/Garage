package Models;

public abstract class vehicle implements Fixable {

    protected  String name;

    public   abstract  int GetFixTime();
public vehicle(String NAME){
    name = NAME;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
