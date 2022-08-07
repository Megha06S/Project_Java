package com.ArrayEx;

public class SortArray {

    public static void sortArray(int arr[])
    {
        int temp=0;
        for (int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
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

        int arr[]={32,1,6,8,23,2,98,27};
        sortArray(arr);

    }
}
