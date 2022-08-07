package com.programming.Jav;

import javax.xml.transform.stream.StreamSource;

public class CheckVowel {

    public static boolean vowelPresence(String str)
    {

        return str.matches(".*[aeiou].*");

    }

    public static void main(String[] args) {
        System.out.println(vowelPresence("bcdfgh"));
    }
}
