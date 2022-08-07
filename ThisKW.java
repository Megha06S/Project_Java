package com.programming.Jav;

public class ThisKW {
    int rollNum;
    String name;
    float fee;



    ThisKW(int rollNum, String name, float fee)
    {
        rollNum=rollNum;
        name=name;
        fee=fee;
    }

    void display()
    {
        System.out.println(rollNum+" "+name+" "+fee);
    }
}
