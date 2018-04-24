package com.av8242n.bignumbers;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * A prime number is a natural number greater than  whose only positive divisors are  and itself. For example, the first six prime numbers are , , , , , and .

 Given a large integer, , use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.
 */

public class CheckPrime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        in.close();
        // Write your code here.
        if (n.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }
}
