package com.av8242n.introduction.staticblock;

import java.util.Scanner;

public class Solution {

    public static boolean flag;
    public static int B;
    public static int H;

    static {
        Scanner in = new Scanner(System.in);
        B = in.nextInt();
        H = in.nextInt();
        flag = false;
        if (B > 0 && H > 0) { flag = true; }
        else {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {

        if (flag) {
            int area = B*H;
            System.out.println(area);
        }
    }
}
