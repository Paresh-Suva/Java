/*
PATTERN: HashMap / Array
DIFFICULTY: Easy
TIME: O(n)
SPACE: O(1)
*/
package com.paresh.dsaquestions.easy;

public class ValidAnagram {

    public static boolean isAnagram(String s, String t) {

        s = s.toLowerCase();
        t = t.toLowerCase();

        if(s.length() != t.length()) {
            return false;
        }

        int[] freq = new int[26];

        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        for(char ch : t.toCharArray()) {
            freq[ch - 'a']--;

            if(freq[ch - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));

        String p = "anagram";
        String q = "naYaram";
        System.out.println(isAnagram(p, q));
    }
}
