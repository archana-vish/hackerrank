package com.av8242n.datastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOperations {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            numbers.add(in.nextInt());
        }
        int operations = in.nextInt();
        String operation;
        for (int i = 0; i < operations; i++) {
            operation = in.next();
            switch(operation) {
                case "Insert":
                    //System.out.println("Insert elements");
                    int pos = in.nextInt();
                    int val = in.nextInt();
                    numbers.add(pos, val);
                    break;
                case "Delete":
                    //System.out.println("Delete elements");
                    int del = in.nextInt();
                    numbers.remove(del);
                    break;
            }
        }
        numbers.stream()
                .forEach(System.out::print);
    }
}
