package com.av8242n.introduction.datetime;

import java.time.LocalDate;
import java.util.Scanner;

public class Solution {

    public static String getDay(String day, String month, String year) {
        /*
        * Write your code here.
        */

        LocalDate newDate = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        return newDate.getDayOfWeek().name();

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));

    }
}
