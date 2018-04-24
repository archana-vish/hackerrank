package com.av8242n.bignumbers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Given an array, , of  real number strings, sort them in descending order — but wait, there's more!
 * Each number must be printed in the exact same format as it was read from stdin, meaning that  is printed as , and  is printed as .
 * If two numbers represent numerically equivalent values (e.g., ), then they must be listed in the same order as they were received as input).
 */

public class PrintArrays {
    public static void main(String []args){
        //Input
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }
        sc.close();

        s = Arrays.copyOf(s, n);

        Arrays.sort(s, 0, n, Collections.reverseOrder( Comparator.comparing(BigDecimal::new)));

        //Output
        for(int i=0;i<n;i++)
        {
            System.out.println(s[i]);
        }
    }

}
