package cw1.zad4;

import java.util.ArrayList;

public class MainDuckSim {
    public static void main(String[] args){

        ArrayList<Duck> kaczki = new ArrayList<>();
        kaczki.add(new MallardDuck());
        kaczki.add(new RubberDuck());
        kaczki.add(new ModelDuck());

        //pętla for each
        for(Duck duck: kaczki){
            duck.performQuack();
            duck.performFly();
        }

        kaczki.get(1).setFlyingBehavior(new FlyingBehavior() {
            @Override
            public void fly() {
                System.out.println("Duck is flying with a jetpack");
            }
        });

        kaczki.get(1).performFly();

    }





}
