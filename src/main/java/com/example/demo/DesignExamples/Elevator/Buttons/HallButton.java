package com.example.demo.DesignExamples.Elevator.Buttons;

import com.example.demo.DesignExamples.Elevator.Enums.Direction;
import com.example.demo.DesignExamples.Elevator.Enums.FloorNumber;

public class HallButton implements Button{

    public Direction direction;

    public FloorNumber floorNumber;

    Boolean status;

    HallButton(Direction direction, FloorNumber floorNumber, Boolean status)
    {
        this.floorNumber=floorNumber;
        this.direction=direction;
        this.status=status;
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
