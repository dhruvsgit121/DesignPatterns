package org.example;

public class SimplePizzaFactory {
    public Pizza getPizzaType(String pizzaType){
        Pizza pizza  = null;
        if(pizzaType == "cheese"){
            pizza = new CheesePizza();
        }else if(pizzaType == "greek"){
            pizza = new GreekPizza();
        }else if(pizzaType == "pepperoni"){
            pizza = new PepperoniPizza();
        }else{
            pizza = new VeggiePizza();
        }
        return  pizza;
    }
}
