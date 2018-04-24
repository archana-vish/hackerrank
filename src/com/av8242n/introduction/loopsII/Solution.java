package com.av8242n.introduction.loopsII;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for (int count = 0; count < n; count++) {
                int sum = 0;
                for (int loop = 0; loop <= count; loop++) {
                    sum += ( Math.pow(2, loop) * b);
                }
                System.out.print(a + sum + " ");
            }
            System.out.println();
        }
        in.close();
    }
}
