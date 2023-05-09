package com.project.adapterpatern;

public class Main {
    public static void main(String[] args) {
        //We need adapter (from animal to human)
        makeHumansEat(new  IHUman[] {
            new Bobby(),
            new AnimalToHumanAdapter(new Dog())
        });
    }
    public static void makeHumansEat(IHUman[] humans){
        for (IHUman human: humans) {
            human.eat();
            //System.out.println(human.saySomething());
        }
    }
}