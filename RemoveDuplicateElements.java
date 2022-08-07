package com.programming.Jav;

import java.util.Arrays;

public class RemoveDuplicateElements {

    public static int removeDuplicateElements(int arr[], int n){
        if (n==0 || n==1){
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for (int i=0; i<n-1; i++){
            if (arr[i] != arr[i+1]){
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n-1];
        // Changing original array
        for (int i=0; i<j; i++){
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main (String[] args) {
        int arr[] = {12,20,70,30,90,20,20,50,40,70,50};//unsorted array
        Arrays.sort(arr);//sorting array
        for(int x:arr)
        {
            System.out.print(x + " ");
        }
        System.out.println();
        int length = arr.length;
        length = removeDuplicateElements(arr, length);
        //printing array elements
        for (int i=0; i<length; i++)
        {

            System.out.print(arr[i]+" ");
        }

    }
}
