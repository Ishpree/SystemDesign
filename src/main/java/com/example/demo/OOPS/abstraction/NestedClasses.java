package com.example.demo.abstraction;

// Nested classes help to hide the functionality of the inner classes
public class NestedClasses {

     //
     class Cash
     {
        int amount;
     }

     //static nested class will not access to any members of the enclosing class
     //because it is not associated with any instance of that class
     static class Bonds
     {
       int total;
     }

    public static void main(String[] arg)
    {
         // we need to create an object of the outer class first and then we can call amount variable of the 
         //inner class
          NestedClasses obj = new NestedClasses();
          Cash cash = obj.new Cash();
          cash.amount= 150000;
          System.out.println(cash.amount);

         //we dont need to create the object of the outer class if the inner class is static
          Bonds bond= new NestedClasses.Bonds();
          bond.total=300000;
          System.out.println(bond.total);


    }

}


