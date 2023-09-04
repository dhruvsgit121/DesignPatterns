package org.example;

abstract public class Duck {
    public Flyable flyableObject;
    public Quackable quackableObject;

    Duck(Flyable flyable, Quackable quackable) {
        this.flyableObject = flyable;
        this.quackableObject = quackable;
    }

    void performFly() {
        this.flyableObject.Fly();
    }

    void performQuack() {
        this.quackableObject.Quack();
    }

    public void display() {
        System.out.println("Display for the Duck!!!");
    }
}
