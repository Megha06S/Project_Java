package com.ArrayEx;

public class FindSecondLargest {

    public static int secondLargest(int arr[])
    {
       int temp;
       int len=arr.length;
       for(int i=0;i<arr.length;i++)
       {
           for(int j=i+1;j<arr.length;j++) {
               if (arr[i] > arr[j])
               {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
               }
           }
       }
    return arr[len-2];
    }

    public static void main(String[] args) {
        int arr[]={34,25,67,12,45,35};
        System.out.println(secondLargest(arr));
    }
}
