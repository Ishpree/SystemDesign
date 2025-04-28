package com.example.demo.OOPS.inheritance;

public class Car extends Vehicle {

    int gears;
    String colour;

    Car()
    {
        //In the constructor if super is called, it should be the first statment only.
       super(3);
       System.out.println("Car is starting");
    }


    public void brakes()
    {
        Scooter sc=new Scooter();
        sc.breaking(this);
        super.brakes();
        System.out.println(this);
        System.out.println(this.colour);
        System.out.println("I have 4 brakes");
    }


    public static void main(String[] arg)
{
    Car car = new Car();
    car.wheels=4;
    car.colour="White";
    car.gears=5;
    car.brakes();
    System.out.println(car.wheels);
    // Scooter s=new Scooter();
    // s.breaking(car);

}
}

class Scooter
{
     void breaking(Car car)
     {
        System.out.println(car.gears);
     }

}

