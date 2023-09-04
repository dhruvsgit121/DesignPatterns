package org.example;

public class NoSound implements Quackable{
    @Override
    public void Quack() {
        System.out.println("NoSound called");
    }
}
