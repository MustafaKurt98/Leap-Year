package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter a year: ");
        Scanner yil =new Scanner(System.in);
        int leap=yil.nextInt();

        boolean a=false;
        if ((leap%4==0 & leap%100!=0)|leap%400==0)
            a=true;
        if(a)
            System.out.println(leap+ " is a leap year");
        else
            System.out.println(leap+ " is not a leap year");


    }
}
