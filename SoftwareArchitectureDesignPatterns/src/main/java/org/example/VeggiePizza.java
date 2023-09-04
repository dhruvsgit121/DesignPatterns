package org.example;

public class VeggiePizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("VeggiePizza Bake Method Called!!!");
    }

    @Override
    public void cut() {
        System.out.println("VeggiePizza Cut Method Called!!!");
    }

    @Override
    public void prepare() {
        System.out.println("VeggiePizza Prepare Method Called!!!");
    }

    @Override
    public void box() {
        System.out.println("VeggiePizza Box Method Called!!!");
    }
}
