package com.example.demo.DesignPatterns.ObserverPattern.Observer;

import com.example.demo.DesignPatterns.ObserverPattern.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {

     String username;
     StocksObservable observable;

     //The default visibility of a constructor is package-private which means it is visible only within the same package
   public  MobileAlertObserverImpl(String username, StocksObservable observable)
     {
         this.username=username;
         this.observable=observable;
     }

     public void update()
     {
        sendMsg(username, "The item is back in stock");
     }

     private void sendMsg(String username, String msg)
     {
        System.out.println("Send msg to user" + username);
     }


}
