package com.av8242n.introduction.loopsI;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int count = 1; count <= 10; count++) {
            System.out.println(n + " x " + count + " = " + (n*count));
        }
    }
}
