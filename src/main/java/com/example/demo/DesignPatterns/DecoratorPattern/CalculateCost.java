package com.example.demo.DesignPatterns.DecoratorPattern;

public class CalculateCost {

    public static void main(String[] args)
    {
         BasePizza p = new SweetCorn(new Cheese(new VegLoaded()));
         System.out.println(p.cost());
    }

}
