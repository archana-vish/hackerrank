package com.av8242n.datastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class HourGlassSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }

        List<Integer> sumHG = new ArrayList<>();

        for (int iRow = 0; iRow < 4; iRow++) {
            for (int iCol = 0; iCol < 4; iCol++) {
                sumHG.add(arr[iRow][iCol] + arr[iRow][iCol + 1] + arr[iRow][iCol + 2] +
                        arr[iRow + 1][iCol + 1]+
                        arr[iRow + 2] [iCol] + arr[iRow + 2] [iCol + 1] + arr[iRow+2] [iCol + 2]);
            }
        }


        Collections.sort(sumHG);

        System.out.println(sumHG.get(sumHG.size() - 1));
    }
}
