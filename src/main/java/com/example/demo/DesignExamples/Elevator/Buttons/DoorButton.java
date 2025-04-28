package com.example.demo.DesignExamples.Elevator.Buttons;

import com.example.demo.DesignExamples.Elevator.Enums.DoorStatus;

public class DoorButton implements Button{

    Boolean status;

    public DoorStatus ds;

    DoorButton(Boolean status, DoorStatus s)
    {
        this.status=status;
        this.ds=s;
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
