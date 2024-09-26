package com.example.task10;

public class Task10Main {
    public static void main(String[] args)
    {
        int[] arr = {7, 8, 9, 7, 7, 7};
        System.out.println(numMin(arr));
    }

    static int numMin(int[] arr)
    {
        int minnum = 10*10;
        int maxi = 0;

        for(int i = 0; i < arr.length; i++)
        {
            if (minnum>=arr[i])
            {
                minnum=arr[i];
                maxi=i;
            }
        }

        return maxi;
    }

}