package com.example.task02;

public class Task02Main {
    public static void main(String[] args)
    {
        System.out.println(getSeason(10));
    }

    static String getSeason(int monthNumber)
    {
        if(monthNumber==1 || monthNumber==2|| monthNumber==12)
        {
            return "зима";
        }
        else if(monthNumber==3 || monthNumber==4|| monthNumber==5)
        {
            return "весна";
        }
        else if(monthNumber==6 || monthNumber==7|| monthNumber==8)
        {
            return "лето";
        }
        else if(monthNumber==9 || monthNumber==10 || monthNumber==11)
        {
            return "осень";
        }

        return "";
    }
}