package zad5;

public class GreatBritain extends Country {
    public String name = "Wielka Brytania";
    public  String getName()
    {
        return name;
    }

    @Override
    public float tax() {
        return 20;
    }
}
