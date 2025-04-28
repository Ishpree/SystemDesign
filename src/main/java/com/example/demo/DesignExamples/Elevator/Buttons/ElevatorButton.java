package com.example.demo.DesignExamples.Elevator.Buttons;

import com.example.demo.DesignExamples.Elevator.Enums.FloorNumber;

public class ElevatorButton implements Button{

    private Boolean status;

    public FloorNumber floorNumber;

    ElevatorButton(Boolean status, FloorNumber floorNumber)
    {
        this.status=status;
        this.floorNumber=floorNumber;
    }

    public Boolean isPressed()
    {
        return status;
    }

    public Boolean Press()
    {
        status=!status;
        return status;
    }












}
