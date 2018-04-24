package com.av8242n.introduction.ifelse;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String ans="";
        if(n%2==1){
            ans = "Weird";
        }
        else{
            //Complete the code
            if (n >= 2 && n <= 5) {
                ans = "Not Weird";
            } else if ( n >= 6 && n <= 20) {
                ans = "Weird";
            } else {
                System.out.println("Not Weird");
            }

        }
        System.out.println(ans);
    }

}
