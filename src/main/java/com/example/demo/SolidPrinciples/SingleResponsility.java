package com.example.demo.SolidPrinciples;

public class SingleResponsility {



}

class Marker
{
    String name;
    String color;
    int year;
    int price;

    public Marker(String name, String color, int year, int price)
    {
        this.name=name;
        this.color=color;
        this.year=year;
        this.price=price;

    }

}

class Invoice
{
    Marker marker;
    int quantity;

   public Invoice(Marker marker, int q)
    {
        this.marker=marker;
        this.quantity=q;
    }

   public int calcPrice()
    {
        int price= (marker.price)*quantity;
        return price;

    }

    //If we add the following 2 functions also in this class, this class will not follow the single responsibility 
    //principle because it already has one reason to change, which is if we change the way price is calculated, say we need
    //to also include gst.
    //What if the method to save to DB or way of printing has to change then this class not following the principle
    //hence different classes are created for the following 2 operations


    //public void saveToDB()
    //{
        //SAVE DATA TO DB
    //}

    // public void printInvoice()
    // {
    //     //print Invoice
    // }

}

class SaveInvoice
{
    Invoice invoice;

    SaveInvoice(Invoice i)
    {
        this.invoice=i;
    }

    public void saveToDB()
    {
        //save
    }

}

class print
{
    Invoice invoice;

    print(Invoice i)
    {
        this.invoice=i;
    }

    public void printInvoice()
    {
        //print
    }

}
