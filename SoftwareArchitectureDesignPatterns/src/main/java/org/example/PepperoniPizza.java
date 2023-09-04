package org.example;

public class PepperoniPizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("PepperoniPizza Bake Method Called!!!");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza Cut Method Called!!!");
    }

    @Override
    public void prepare() {
        System.out.println("PepperoniPizza Prepare Method Called!!!");
    }

    @Override
    public void box() {
        System.out.println("PepperoniPizza Box Method Called!!!");
    }
}
