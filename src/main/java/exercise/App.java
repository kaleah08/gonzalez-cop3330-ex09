package exercise;

/*UCF COP3330 Fall 2021 Assignment 1 Solution
Copyright 2021 Kaleah Gonzalez */

import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        Scanner input = new Scanner(System.in);
        System.out.print("What is the length? ");
        String firstString = input.next();
        int length = Integer.parseInt(firstString);

        System.out.print("What is the width? ");
        String secondString = input.next();
        int width = Integer.parseInt(secondString);

        final int conversion = 350;
        int squareFeet = length * width;
        int gallons = (squareFeet + conversion - 1) / conversion;

        System.out.println("You will need to purchase " + gallons + " gallons of paint to cover " + squareFeet + " square feet.");
    }
}
