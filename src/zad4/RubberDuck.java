package zad4;

public class RubberDuck extends Duck{

    public RubberDuck(){
        super(new FlyingNoWay(), new Squeek());
    }

    public RubberDuck(FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        super(flyingBehavior, quackBehavior);
    }

}
