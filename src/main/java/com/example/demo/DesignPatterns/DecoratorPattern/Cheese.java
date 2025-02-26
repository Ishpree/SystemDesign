package com.example.demo.DesignPatterns.DecoratorPattern;

public class Cheese extends ToppingDecorator {

    BasePizza basePizza;

    Cheese(BasePizza basePizza)
    {
        this.basePizza=basePizza;
    }

    int cost()
    {
        return basePizza.cost()+20;
    }

}
