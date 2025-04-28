package com.example.demo.OOPS.abstraction;

public class AnonymousClasses {

     public static void main(String[] arg)
     {
    //Anonymous class
    //sub class of the class RealState is created without giving a seperate name
    //This will be only used once
    RealEstate obj = new RealEstate()
    {
        // void currentRate()
        // {
            
        // }
       
        public void property()
        {
            System.out.println("50,000,00");
        }

    };

    //implementing an interface using an anonymous class
    LandValue obj1 = new LandValue()
    {
        public void calculate()
        {
            
        }
    };
      
      //obj.currentRate cannot be done like this, only methods that are part 
      //of the super class can be called outside the class
      //there is a different way to call the methods that are specfic to the anonymous class
       obj.property();
       obj1.calculate();
     }

}


class RealEstate
{
   public void property()
    {
         
    }
}

interface LandValue
{
    void calculate();
    
}


