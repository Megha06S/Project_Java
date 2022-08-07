package com.programming.Jav;

import javax.imageio.stream.ImageInputStream;

public class Fibb {

    public static void fibb(int num)
    {
        int a=0;
        int b=1;
        int c=1;
        for(int i=1;i<=num;i++)
        {
            System.out.print(a + " , ");
            a=b;
            b=c;
            c=a+b;
        }
    }

    public static void main(String[] args) {
        fibb(7);
    }
}
