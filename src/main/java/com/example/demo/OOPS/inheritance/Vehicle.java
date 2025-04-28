package com.example.demo.OOPS.inheritance;

public class Vehicle {

       int wheels;
       final String brand="Maruti";

        Vehicle()
        {
            System.out.println("Vehicle is starting");
        }

        Vehicle(int wheels)
        {
            this.wheels=wheels;
            System.out.println("I have " + wheels +" wheels");
        }

        //cannot be over ridden in the child class 
        final void brand()
        {
            System.out.println("I am Maurti");
        }
    
        public void brakes()
        {
            System.out.println("I have brakes");
        }
    
        // public static void main(String[] arg)
        // {
               
        // }
    
    }
