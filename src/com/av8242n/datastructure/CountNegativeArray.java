package com.av8242n.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CountNegativeArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        List<Integer> negSum = new ArrayList<>();
        int sum = 0;

        for (int max = 0; max < n; max++) {
            sum = 0;
            System.out.println("====");
            for (int inner = max; inner < n; inner++) {
                System.out.print(inner + "\t");
                sum += arr[inner];

                if (sum < 0) {negSum.add(sum);}
            }

        }

        System.out.println(negSum.size());


    }
}
