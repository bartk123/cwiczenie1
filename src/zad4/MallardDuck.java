package zad4;

public class MallardDuck extends Duck {

        public MallardDuck(){
            super(new FlyingWithWings(), new Quack());
        }

    public MallardDuck(FlyingBehavior flyingBehavior, QuackBehavior quackBehavior) {
        super(flyingBehavior, quackBehavior);
    }

}
