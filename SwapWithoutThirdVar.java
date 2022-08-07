package com.programming.Jav;

public class SwapWithoutThirdVar {

    public void swap(int a, int b)
    {
        //a=25, b=35;
        b=b+a;//35+25=60
        a=b-a; // 60-25=35
        b=b-a;// 60-35= 25

        System.out.println("After swap value of A : " + a);
        System.out.println("After swap value of B : " + b);

    }

    public static void main(String[] args) {
        SwapWithoutThirdVar swap= new SwapWithoutThirdVar();
        swap.swap(50,55);

    }

}
