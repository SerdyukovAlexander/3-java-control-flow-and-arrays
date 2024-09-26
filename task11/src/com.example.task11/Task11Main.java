package com.example.task11;

import java.util.Objects;

public class Task11Main
{
    public static void main(String[] args)
    {
        int[] arr = {12, 11, 4, 4, 10, 7, 5, 9};
        swap(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void swap(int[] arr)
    {
        if(!Objects.isNull(arr) && arr.length>0)
        {
            int minnum = 10 * 10;
            int maxi = 0;
            int a;

            for (int i = 0; i < arr.length; i++) {
                if (minnum >= arr[i]) {
                    minnum = arr[i];
                    maxi = i;
                }
            }

            a = arr[0];
            arr[0] = arr[maxi];
            arr[maxi] = a;
        }
    }
}