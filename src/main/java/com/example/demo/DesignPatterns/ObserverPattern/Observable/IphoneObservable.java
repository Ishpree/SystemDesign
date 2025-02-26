package com.example.demo.DesignPatterns.ObserverPattern.Observable;

import java.util.ArrayList;
import java.util.List;
import com.example.demo.DesignPatterns.ObserverPattern.Observer.NotificationAlertObserver;

public class IphoneObservable implements StocksObservable {

    public List<NotificationAlertObserver> o = new ArrayList<>();
    public int stockCount=0;

    public void add(NotificationAlertObserver n)
    {
        o.add(n);
    }

    public void remove(NotificationAlertObserver n)
    {
        o.remove(n);
    }

   public void notifySubscribers()
    {
          for(NotificationAlertObserver observer: o)
          {
                observer.update();
                //for calling the update function there could be two options either we pass the observable object
                //from here, but in this case if there are more than one kinds of observable like say there is a
                //weather observable, we will have use instance of everytime to figure out in the update function
                //which observable it is
                //instead we use constructor injection.
          }
    }

    public void setStockCount(int newStock)
    {
         if(stockCount==0)
          {
            notifySubscribers();
          }
          stockCount=stockCount+newStock;
    }

   public int getStockCount()
    {
        return stockCount;
    }



}
