package com.pluralsight;

import java.util.Random;

public class MathApp {
    public static void main(String[] args)  {

            int bobSalary = 90000;
            int garySalary =65000;

            int highestSalary = Math.max(bobSalary, garySalary);

            System.out.println("The highest salary is "  +  highestSalary);

            int carPrice = 35000;
            int truckPrice = 20000;

            float radius = (float) Math.PI * 7.25F;
            System.out.println("The area of the circle is " + radius);

            float sqrt = (float) Math.sqrt(5.0F);
            System.out.println("The square root is " + sqrt);

            int x1 = 5;
            int x2 = 10;
            int y1 = 85;
            int y2 = 50;

            int distanceX = x2 - x1;
            int distanceY = y1 - y2;
            System.out.println("The distance between both points are " + distanceY + "y and for x it is " + distanceX);

            float value = (float) Math.abs(-3.8);
            System.out.println("The positive value after it is set is " + value);

            double randomNumber;
            randomNumber = Math.random();
            System.out.println("The number between 0 and 1 is " + randomNumber);

    }

}