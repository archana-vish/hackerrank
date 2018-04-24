package com.av8242n.exceptionhandling;


import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * You will be given two integers  and  as input, you have to compute .
 * If  and  are not  bit signed integers or if  is zero, exception will occur and you have to report it.
 * Read sample Input/Output to know what to report in case of exceptions.
 */
public class CatchInvalidExceptions {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        String x = in.next();
        String y = in.next();

        testAndDivide(x,y);
       }

    public static void testAndDivide(String x, String y) {
        try {
            System.out.println(Integer.parseInt(x)/Integer.parseInt(y));
        } catch(NumberFormatException ime) {
            System.out.println(new InputMismatchException());
        } catch(ArithmeticException ae) {
            System.out.println(ae);
    }
}



}
