package com.example.demo.DesignPatterns.StrategyPattern;

public class GoodsVehicle extends Vehicle {

    GoodsVehicle()
    {
        super(new NormalDriveStrategy());
    }

}
