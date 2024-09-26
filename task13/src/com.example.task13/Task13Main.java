package com.example.task13;

import java.util.Objects;

public class Task13Main {
    public static void main(String[] args)
    {
        int[] arr = {9, 1100, 7, 8};
        removeMoreThen1000(arr);
        System.out.println(java.util.Arrays.toString(arr));
    }

    static int[] removeMoreThen1000(int[] arr)
    {
        if(!Objects.isNull(arr) && arr.length>0)
        {
            int bigNumbers = 0;
            for (int j = 0; j < arr.length; j++)
            {
                if (arr[j] > 1000)
                {
                    bigNumbers++;
                }
            }

            int[] newArr = new int[arr.length-bigNumbers];
            int n = 0;

            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] > 1000)
                {
                    continue;
                }

                else if (arr[i] <= 1000)
                {
                    newArr[n] = arr[i];
                    n += 1;
                }
            }

            return newArr;
        }

        return arr;
    }
}