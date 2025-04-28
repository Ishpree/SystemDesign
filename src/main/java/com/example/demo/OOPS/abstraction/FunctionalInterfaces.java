package com.example.demo.OOPS.abstraction;

public class FunctionalInterfaces {


    //Lambda function 
    //implementing functional interface
      MyLand obj = () -> {

        System.out.println("Bellandur");
        return "560103";
      };
 
      public static void main(String[] arg)
      {
        //The syntax of the lambda function is of the type
       //functional interface variable = (parameters)->{body}
       //when the function of the functional interface has no parameters we can leave it blank like in our
       //case, if there is only one statement we can skip the curly statements for the body
       //The target type means the variable to which you are assigning, it 
       // must be of the functional interface type

          MyLand obj1 = () -> "Green Glen Layout";
          System.out.println(obj1.location());
          
          FunctionalInterfaces f = new FunctionalInterfaces();
          System.out.println(f.obj.location());

    
        //We can also pass the lambda fucntions as a paramters to a function or we can
        //also return a lambda function from a function
        //The syntax for it is as follows:

        //checkString("Hello", s->s.length()>3);
        
        //when used in event listner
        //button.addActionListner(e->System.out.println("Clicked"));
      }
      
      //How is the lamda function stored in memory
      
 
      
}

//interface that has only one function
@FunctionalInterface
interface MyLand
{
    String location();
}

