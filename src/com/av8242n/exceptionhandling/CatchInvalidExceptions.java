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
    public static void main(String[] args) {
       try(Scanner in = new Scanner(System.in)) {
           System.out.println(Integer.parseInt(in.next())/Integer.parseInt(in.next()));
       }catch(ArithmeticException | NumberFormatException e) {
           System.out.println(e);
       }
    }
}
