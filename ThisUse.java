package com.programming.Jav;

public class ThisUse {
    int rollNum;
    String name;
    float fee;

//    ThisUse()
//    {
//        this(5,"Calling parameterized cons from def cons", 1000f);
//        System.out.println("this is constructor");
//    }
    ThisUse(int rollNum, String name, float fee)
    {
        this.rollNum=rollNum;
        this.name=name;
        this.fee=fee;

    }


//
//     ThisUse(int x) {
//         this();
//        System.out.println(x);
//
//    }

    void display()
    {
        System.out.println(rollNum+" "+name+" "+fee);
    }

    void m()
    {
        System.out.println("This is m method");
    }

    void n()
    {
        System.out.println("This is n method");
        this.m();
    }
}


