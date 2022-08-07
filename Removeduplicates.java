package com.ArrayEx;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Removeduplicates {

    public static void duplicate(int arr[],int n)
    {
        Set <Integer>st=new HashSet<>();
        for(int i=0;i<n-1;i++)
        {
            st.add(arr[i]);
        }


        for(int x: st)
        {
            System.out.println(x);
        }

    }

//    public static void duplicate(int arr[],int n)
//    {
//        HashMap<Integer,
//                        Boolean> mp = new HashMap<>();
//
//        for (int i = 0; i < n; ++i)
//        {
//
//            // Print the element if it is not
//            // there in the hash map
//            if (mp.get(arr[i]) == null) {
//                System.out.print(arr[i] + " ");
//            }
//            // Insert the element in the hash map
//            mp.put(arr[i], true);
//        }
//    }

    public static void main(String[] args) {
        int arr[]= {34,2,1,33,65,33,1,2};
        int n= arr.length;
        duplicate(arr,n);
    }
}
