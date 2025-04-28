package com.example.demo.Fundamentals;

class Car{

    String model;
    int year;

     Car(String model, int year)
     {
        this.model=model;
        this.year=year;
     }

     @Override
     public String toString() 
     {
         return "The model of car is " + model;
     }

     @Override
     public boolean equals(Object obj)
     {
        Car c=(Car)obj;
        if((this.model.equals(c.model)) && (this.year==c.year))
        {
           return true;
        }
        return false;
     }

}

public class LearnObjectClass {

    public static void main(String[] args)
    {
        Car obj=new Car("Honda", 2022);
        System.out.println(obj); //Here if we print obj , at the backend obj.toString is invoked
        //But if we override the toString method then it will return what we have overrideen

        Car obj1=new Car("Honda", 2022);
        Car obj2=new Car("Honda", 2022);

        System.out.println(obj1==obj2);//prints false since the refernces are pointing to two different objects

        System.out.println(obj1.equals(obj2));// the equals function also will originally be 
        //returning false, but since we have over ridden the function to compare individual 
        //values of model and year, returns true;

}

}