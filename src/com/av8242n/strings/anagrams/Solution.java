package com.av8242n.strings.anagrams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    static List<String> getList(String a) {
        return Stream.of(a)
                .map(w -> w.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    static Map<String, Integer> addToMap(String a) {
        Map<String, Integer> aCount = new HashMap<>();

        String s = "";

        for (char c : a.toUpperCase().toCharArray()) {

            s = c+"";

            if (aCount.containsKey(s)) {
                aCount.put(s, (aCount.get(s) + 1));
            } else {
                aCount.put(s, 1);
            }
        }

        return aCount;
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function

       Map<String, Integer> bCount = addToMap(a);
       Map<String, Integer> cCount = addToMap(b);

       return (bCount.equals(cCount));


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
