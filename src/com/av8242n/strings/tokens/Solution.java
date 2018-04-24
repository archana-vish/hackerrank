package com.av8242n.strings.tokens;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Given a string, , matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens.
 * We define a token to be one or more consecutive English alphabetic letters.
 * Then, print the number of tokens, followed by each token on a new line.
 */

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = "my my my, isn't this grand!?!?"; //in.nextLine();

        if (s.trim().isEmpty()) {
            System.out.println("0");
        }
        else {

            String[] tokens = s.trim().split("[\\s , ' \\? ! \\._@]+");

            System.out.println(tokens.length);
            Arrays.stream(tokens)
                    .forEach(System.out::println);
        }

    }
}
