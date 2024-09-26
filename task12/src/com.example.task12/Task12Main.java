package com.example.task12;

import java.util.Objects;

public class Task12Main
{
    public static void main(String[] args)
    {
        int[] arr = {9, 11, 7, 8};
        selectionSort(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static void selectionSort(int[] arr)
    {
        if(!Objects.isNull(arr) && arr.length>0)
        {
            int n = 0;

            while (n < arr.length)
            {
                int minnum = Integer.MAX_VALUE;
                int maxI = 0;
                int buf;

                for (int i = n; i < arr.length; i++)
                {
                    if (minnum >= arr[i])
                    {
                        minnum = arr[i];
                        maxI = i;
                    }
                }

                buf = arr[n];
                arr[n] = minnum;
                arr[maxI] = buf;
                n += 1;
            }
        }
    }

}