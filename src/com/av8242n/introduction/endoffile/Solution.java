package com.av8242n.introduction.endoffile;

import java.io.EOFException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 1;
        while (in.hasNextLine()) {
            System.out.println(count++ + " " + in.nextLine());
        }

    }
}
