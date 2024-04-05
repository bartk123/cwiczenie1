package cw1.zad5;

public class Germany extends Country{
public String name = "Niemcy";
    public  String getName()
    {
        return name;
    }
    @Override
    public float tax() {
        return 19;
    }
}
