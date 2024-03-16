package zad5;

public class Poland extends Country {
    public String name = "Polska";
    public  String getName()
    {
        return name;
    }

    @Override
    public float tax() {
        return 23;
    }
}
