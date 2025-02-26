package com.example.demo.DesignPatterns.DecoratorPattern;

public class SweetCorn extends ToppingDecorator {

    BasePizza basePizza;

    SweetCorn(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }

    int cost()
    {
        return basePizza.cost() + 15;
    }

}
