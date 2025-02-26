package com.example.demo.DesignPatterns.StrategyPattern;

public class Vehicle 
{
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy d)
    {
        this.driveStrategy=d;
    }

    void drive()
    {
        driveStrategy.drive();
    }

}



