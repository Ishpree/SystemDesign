package com.example.demo.DesignPatterns.StrategyPattern;

public class OffroadVehicle extends Vehicle 
{
    OffroadVehicle()
    {
        super(new SportsDriveStrategy());
    }

}

