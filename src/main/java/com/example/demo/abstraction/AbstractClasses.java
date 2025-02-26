package com.example.demo.abstraction;


public class AbstractClasses
{
        public static void main(String[] arg)
        {
            Grow g=new Grow();
            g.totalReturns();
            g.dailyReturns();
            System.out.println(g.sipAmount(3000, 2000));
        }
}

abstract class Investment {

        abstract void totalReturns();

        abstract void dailyReturns();

        long sipAmount(int x, int y)
        {
          long total=x+y;
          return total;      
        }

}

class Grow extends Investment{

        @Override
        void totalReturns()
        {
            System.out.println("TotalReturns" + 100000);

        }

        @Override
        void dailyReturns()
        {
           System.out.println("DailyReturns" + 3000);
        }

}

