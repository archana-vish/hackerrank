package com.av8242n.strings.username;

/**
 * A username is considered valid if all the following constraints are satisfied:

 The username consists of  to  characters inclusive, i.e., if the username consists of less than  or greater than  characters, then it is invalid username.
 The username must contain alphanumeric characters, and underscores (_) only. Alphanumeric characters describe the character set consisting of lowercase characters , uppercase characters , and digits .
 The first character of the username must be an alphabetic character, i.e., either lowercase character  or uppercase character .
 */

import java.util.Scanner;

public class Solution {

    private static final Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}

class UsernameValidator {
    /*
     * Write regular expression here.
     */
    public static final String regularExpression = "(^[a-z A-Z]\\w{7,29}$)";
}
