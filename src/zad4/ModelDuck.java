package zad4;

public class ModelDuck extends Duck{

    public ModelDuck(){
        super(new FlyingNoWay(), new MuteQuack());
    }

    public ModelDuck(FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        super(flyingBehavior, quackBehavior);
    }

}
