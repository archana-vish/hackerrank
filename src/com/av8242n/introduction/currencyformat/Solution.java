package com.av8242n.introduction.currencyformat;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import static java.util.Locale.CHINA;
import static java.util.Locale.FRANCE;
import static java.util.Locale.US;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        String us = NumberFormat.getCurrencyInstance(US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
