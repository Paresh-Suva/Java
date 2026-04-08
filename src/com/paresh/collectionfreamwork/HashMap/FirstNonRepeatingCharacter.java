package com.paresh.collectionfreamwork.HashMap;

import java.util.HashMap;

public class FirstNonRepeatingCharacter {

    public static char firstUniqueChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Find first with freq = 1
        for (char c : s.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }

        return '_';
    }

    static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqueChar(s)); // l
    }
}