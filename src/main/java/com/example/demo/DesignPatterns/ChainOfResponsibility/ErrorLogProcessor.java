package com.example.demo.DesignPatterns.ChainOfResponsibility;

public class ErrorLogProcessor extends LogProcessor {

    public ErrorLogProcessor(LogProcessor logProcessor)
    {
        super(logProcessor);
    }


    public void log(int level, String message)
    {
        if(level==ERROR)
        {
           System.out.println("ERROR"+ message);
        }
        else
        {
            super.log(level, message);
        }

    }



}
