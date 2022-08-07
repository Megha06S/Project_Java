package com.programming.Jav;

public class variablesTest {

    //static block
    static
    {
        System.out.println("Static block should run before main at time of class loading");
    }

    String name="Megha Singh";
    static int a1=20;

    int b1=30;

    public static void main(String[] args) {
        variablesTest v=new variablesTest();
        int a;
        int b=10;
        System.out.println(b);
        System.out.println(v.name);
        System.out.println(a1);
        a1=22;
        System.out.println(a1);
      //  System.out.println(b1);
    }

}
