package cw1.zad3;

public class car {
    private String name;
    private Speed speed;

    public car (Speed speed, String name)
    {
        this.speed = speed;
        this.name = name;
    }
    public String GetSpeed(){
        return speed.GetSpeed();
    }
    public String GetCarName(){
        return name;
    }


}
