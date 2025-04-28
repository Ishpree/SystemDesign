
//Objects are stored in heap memory and their references are stored in stack memory
//Whenever a function is called it is stored in stack memory till it gets executed 
//Stack memory is short lived memory.
//To remove from heap memory garbage collector is used. Whenever an object that exists in the heap 
//memory is no longer being referenced by anything from the stack, the garbage collector removes it.
//Strings are stores in heap memory in a seperate block called spring pool since strings have
//to be accesses multiple times.
package com.example.demo.Fundamentals;

class Data
{
    int data;
}
public class LearnMemory {

    int x=5; //this is stored in the heap memory since it is not a part of any function
    public static void main(String[] args)
    {
        int a=5; //stored in stack memory, even when the value of a is changed in the function change it
        //printed as 5 only 
        //But when the ddata of object d is changed with the function that gets reflected, since
        //reference d is pointing to the same object that is stored in the heap, both initially and 
        //when the value is changed.
        Data d = new Data();
        d.data=3;
        change(a, d);
        System.out.println(a);
        System.out.println(d.data);  
    }
    
    static void change(int a, Data d)
    {
        a = 70;
        d.data=30;
    }

}
