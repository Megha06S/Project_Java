package com.programming.Jav;

public class String1 {
    public static void main(String[] args) {
        String s="str1";
        String s2="str1";
        String s3= new String("str1");

        System.out.println(s==s2);
        System.out.println(s.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);
    }
}
