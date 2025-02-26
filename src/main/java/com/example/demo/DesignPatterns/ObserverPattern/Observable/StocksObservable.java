package com.example.demo.DesignPatterns.ObserverPattern.Observable;

import com.example.demo.DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver n);
    public void remove(NotificationAlertObserver n);
    public void notifySubscribers();
    public void setStockCount(int newStock);
    public int getStockCount();



}
