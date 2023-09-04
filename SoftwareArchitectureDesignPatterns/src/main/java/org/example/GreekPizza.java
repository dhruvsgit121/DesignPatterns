package org.example;

public class GreekPizza implements Pizza{

    @Override
    public void bake() {
        System.out.println("GreekPizza Bake Method Called!!!");
    }

    @Override
    public void cut() {
        System.out.println("GreekPizza Cut Method Called!!!");
    }

    @Override
    public void prepare() {
        System.out.println("GreekPizza Prepare Method Called!!!");
    }

    @Override
    public void box() {
        System.out.println("GreekPizza Box Method Called!!!");
    }
}
