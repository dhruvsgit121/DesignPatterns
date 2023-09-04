package org.example;

public class CheesePizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("CheesePizza Bake Method Called!!!");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza Cut Method Called!!!");
    }

    @Override
    public void prepare() {
        System.out.println("CheesePizza Prepare Method Called!!!");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza Box Method Called!!!");
    }
}
