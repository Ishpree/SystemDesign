package com.example.demo.DesignPatterns.ObserverPattern;

import com.example.demo.DesignPatterns.ObserverPattern.Observable.IphoneObservable;
import com.example.demo.DesignPatterns.ObserverPattern.Observable.StocksObservable;
import com.example.demo.DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;
import com.example.demo.DesignPatterns.ObserverPattern.Observer.EmailAlertObserverImpl;
import com.example.demo.DesignPatterns.ObserverPattern.Observer.MobileAlertObserverImpl;

public class Store {

    public static void main(String[] args)
    {

    StocksObservable st = new IphoneObservable();

    NotificationAlertObserver observer1 = new EmailAlertObserverImpl("ishpreet@gmail.com", st);
    NotificationAlertObserver observer2 = new EmailAlertObserverImpl("ish@gmail.com", st);
    NotificationAlertObserver observer3 = new MobileAlertObserverImpl("ish_2701", st);

    st.add(observer1);
    st.add(observer2);
    st.add(observer3);

    st.setStockCount(10);
    st.setStockCount(50);//no notification is send in this case, because there were already 
    //items in stock



    }
    

}
