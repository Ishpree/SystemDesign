package com.example.demo.SolidPrinciples;

//Open for extension but closed for modification
public class OpenClosed {




}


//This file is already tested and is already taking traffic, so for such classes we dont modify the class
//rather we will extend the class 

// class SaveInvoice
// {
//     Invoice invoice;

//     SaveInvoice(Invoice i)
//     {
//         this.invoice=i;
//     }

//     public void saveToDB()
//     {
//         //save to DB
//     }

//     //since the class is already tested and live when we add this function it is prone to bugs 
//     public void saveToFile()
//     {
        
//     }

// }

//To solve the issue we are using an interface

interface SaveInvoice{

    public void save(Invoice invoice);
}

class SaveInvoiceToDatabase implements SaveInvoice
{
    @Override
    public void save(Invoice invoice)
    {
        //save to DB
    }
}

class SaveInvoiceToFile implements SaveInvoice{

    @Override
    public void save(Invoice invoice)
    {
        
    }
}






