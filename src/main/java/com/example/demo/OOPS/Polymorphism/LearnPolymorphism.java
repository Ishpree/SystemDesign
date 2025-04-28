package com.example.demo.OOPS.Polymorphism;

class Data{

    int data;

    public void printData()
    {
        System.out.println(data);
    }

    public void printData(int amount)
    {
        System.out.println(" We have " + amount + "data");
    }
}

class ChildData extends Data
{
    @Override
    public void printData()
    {
       System.out.println("Overidden" + data);
    }
   
}

public class LearnPolymorphism {

    public static void main(String[] args)
    {
        Data d = new ChildData(); //since the refernce is of the parent object, we cannot call functions
        //that are exclusive to only the child class using this object. If we want that the reference should 
        //also be of the child class
        d.data=2;
        d.printData(); //runtime polymorphism: which method will be called is decided on runtime
        d.printData(5);//compile time polymorphism: it is decided on compile time which function has
        //to be called
    }

}
