package com.example.task06;

import java.util.Arrays;

public class Task06Main
{
    public static void main(String[] args)
    {
        System.out.println(getMax(1, 2, 3, 4));
    }

    static int getMax(int a, int b, int c, int d)
    {
        int[] result = new int[4];
        result[0]=a;
        result[1]=b;
        result[2]=c;
        result[3]=d;
        Arrays.sort(result);

        return result[3];
    }

}