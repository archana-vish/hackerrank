package com.av8242n.datastructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QueryAndFind {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<int[]> numbers = new ArrayList<>();
        int size = 0;

        for (int i = 0; i < n; i++) {
          size = in.nextInt();
          int[] arr = new int[size];
          for (int count = 0; count < size; count++) {
              arr[count] = in.nextInt();
          }
          numbers.add(arr);
        }

        numbers.stream()
                .flatMapToInt( a -> Arrays.stream(a))
                .forEach(System.out::print);



        int qNum = in.nextInt();
        List<Integer> list = new ArrayList<>();
        int arrayNumber = 0;
        int index =0;

       // System.out.println(numbers.get());

        for (int i=0; i< qNum; i++) {
            arrayNumber = in.nextInt();
            index = in.nextInt();

            try {
               System.out.println(numbers.get(arrayNumber-1)[index-1]);
               list.add(numbers.get(arrayNumber-1)[index-1]);
            } catch (Exception e) {
                System.out.println("ERROR!");
                //list.add()
            }
        }

        //System.out.println(list);

    }
}
