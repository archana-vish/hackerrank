package com.av8242n.bignumbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * In this problem, you have to add and multiply huge numbers! These numbers are so big that you can't contain them in any ordinary data types like a long integer.
 */

public class AddAndMultiply {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger num1  = scanner.nextBigInteger();
        BigInteger num2  = scanner.nextBigInteger();
        System.out.println(num1.add(num2));
        System.out.println(num1.multiply(num2));

    }

}
