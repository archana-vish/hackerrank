package com.av8242n.strings.introduction;

import java.util.Scanner;

/**
 * Given two strings of lowercase English letters,  and , perform the following operations:

 Sum the lengths of  and .
 Determine if  is lexicographically larger than  (i.e.: does  come before  in the dictionary?).
 Capitalize the first letter in  and  and print them on a single line, separated by a space.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        System.out.println((A.compareTo(B) > 0) ? "Yes" : "No");
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1) + " " + B.replace(B.charAt(0), (B.charAt(0) + "").toUpperCase().toCharArray()[0]));

    }
}
