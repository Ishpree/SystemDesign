package com.example.demo.DesignPatterns.ObserverPattern.Observer;

import com.example.demo.DesignPatterns.ObserverPattern.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver {

    String email;

    StocksObservable observable;

   public EmailAlertObserverImpl(String email, StocksObservable ob)
    {
        this.email=email;
        this.observable=ob;
    }

    public void update()
    {
        sendEmail(email, "product is in stock hurry up");
    }

    private void sendEmail(String email, String msg)
    {
        System.out.println("Mail sent to" + email);
    }





}



