package org.example;

public class Main {
    public static void main(String[] args) {

        //Mallard Duck Object and Calling the Quack and Fly methods on the fly...
        Duck mallardDuck = new MallardDuck(new FlyWithNoWings(), new Skeaking());
        mallardDuck.performFly();
        mallardDuck.performQuack();

        //Red Head Duck Object and Calling the Quack and Fly methods on the fly...
        Duck redHeadDuck = new RedHeadDuck(new FlyWithWings(), new Girting());
        redHeadDuck.performFly();
        redHeadDuck.performQuack();

        //Rocket Head Duck Object and Calling the Quack and Fly methods on the fly...
        Duck rocketDuck = new RocketDuck(new RocketFlying(), new NoSound());
        rocketDuck.performFly();
        rocketDuck.performQuack();
    }
}