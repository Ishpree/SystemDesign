package com.example.demo.abstraction;

public class LearnInterface 
{

    //interface cannot have instance variable, they can have public static final variables
    public static void main(String[] arg)
    {
        FinancialReport fp = new FinancialReport();
        fp.initialAmount();
        fp.currentAmount();
        fp.investmentType();
        fp.status(110000, 100000);

    }

}


interface MutualFund 
{
    //These functions are implicitly public, all functions in the interface should be public 
    // so that any class implementing the interface can use it

    //In the later java versions, we are allowed to use methods other than just abstract methods
    //inside the interface. An interface no more supports complete abstraction but it 
    //helps resolving another problem which is as follows.
    //For example we want to extend the functionality of this interface by adding another function and 
    //multiple classes are implementing this interface, if it is a really large number it becomes difficult
    //to implement the function in every class, so instead we can create a default function and 
    //override it in only the required classes
    void initialAmount();
    void currentAmount();

    default void investmentType()
     {
        System.out.println("MutualFund");
     }

    //default functions can also be written in an interface 
    default void status(int x, int y)
    {
        if(x-y>0)
        System.out.println("gain");

        else
        System.out.println("loss");
    }

}

interface SIP
{
     void monthlyAmount();

     default void investmentType()
     {
        System.out.println("SIP");
     }

}

//multiple interitance is implemented using interfaces. Normally or by using abstract classes, we 
//cannot implement multiple inheritance because if two interfaces have the same function, it wont be 
//clear which function to implement, but in cases of interfaces we can use super to decide which 
//function to implement
class FinancialReport implements MutualFund, SIP{

    public void initialAmount()
    {
       System.out.println("100000");
    }

    public void currentAmount()
    {
       System.out.println("110000");
    }

    public void monthlyAmount()
    {
        System.out.println("15000");
    }

    public void investmentType()
    {
          MutualFund.super.investmentType();
    }

    //default functions can also be overridden if needed
    public void status(int x, int y)
    {
        if(x-y>0)
        System.out.println("1");

        else
        System.out.println("0");
    }
}


