package com.example.demo.DesignPatterns.StrategyPattern;

public class SportsCar extends Vehicle
{
    SportsCar()
    {
        super(new SportsDriveStrategy());
    }

}


