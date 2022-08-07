package com.ArrayEx;

public class PrintDuplicate {

    public static void Duplicate(int arr[])
    {
        int temp=0;


        for(int i=0;i< arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[]= {34,2,1,33,65,33,1,2};

        Duplicate(arr);
    }
}
