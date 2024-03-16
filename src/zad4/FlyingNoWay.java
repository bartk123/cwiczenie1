package zad4;

public class FlyingNoWay implements FlyingBehavior {

    @Override
    public void fly() {
        System.out.println("Duck is not flying");
    }
}
