package com.av8242n.exceptionhandling;

import java.util.Scanner;

/**
 * You are required to compute the power of a number by implementing a calculator.
 * Create a class MyCalculator which consists of a single method long power(int, int).
 * This method takes two integers,  and , as parameters and finds .
 * If either  or  is negative, then the method must throw an exception which says "".
 * Also, if both  and  are zero, then the method must throw an exception which says ""
 * For example, -4 and -5 would result in .
 * Complete the function power in class MyCalculator and return the appropriate result after the power operation or an appropriate exception as detailed above.
 */


public class MyCalculator {


    public long power(int n, int p) throws Exception {

        if (n==0 || p==0) {
            throw new Exception("n and p should not be zero.");
        } else if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative.");
        } else {
            return (long) Math.pow(n,p);
        }

    }

    public static final MyCalculator my_calculator = new MyCalculator();
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        while (in .hasNextInt()) {
            int n = in .nextInt();
            int p = in .nextInt();

            try {
                System.out.println(my_calculator.power(n, p));
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}