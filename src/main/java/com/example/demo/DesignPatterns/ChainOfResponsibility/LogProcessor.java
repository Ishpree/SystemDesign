package com.example.demo.DesignPatterns.ChainOfResponsibility;

public abstract class LogProcessor {

    LogProcessor nextLogProcessor;

    public static int INFO=1;
    public static int DEBUG=2;
    public static int ERROR=3;

    LogProcessor(LogProcessor processor)
    {
        this.nextLogProcessor=processor;
    }

    public void log(int level, String message)
    {
         if(nextLogProcessor!=null)
         {
             nextLogProcessor.log(level, message);
         }
    }


    

}
