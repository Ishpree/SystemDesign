package com.example.demo.DesignPatterns.ChainOfResponsibility;

public class MainClass {

    public static void main(String[] args)
    {
    LogProcessor obj = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

    //First the object of ErrorLogProcessor is created and its nextLogProcessor points to null
    //Then the object of DebugLogProcessor is created and its nextLogProcessor points to Error log processor
    //Then for the infoLogProcessor and its next Log Processor points to Debug Log Processor

    //When we call the log function the log fucnction of infologprocessor is called, 
    //if it can process the request it will otherwise it will be passed to the next in line
    obj.log(LogProcessor.ERROR, "exception occured");
    obj.log(LogProcessor.DEBUG, "Debug required");
    obj.log(LogProcessor.INFO, "Providing info");

    }



}
