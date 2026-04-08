/*
PATTERN: Sliding Window + HashMap
DIFFICULTY: Medium
TIME: O(n)
SPACE: O(n)
*/

/*
Input: "abcabcab"
Output: 3
 */

package com.paresh.dsaquestions.medium;

import java.util.*;

public class LongestSubstringWithoutRepeating {

    public static int lengthOfLongestSubstring(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        int left = 0;
        int maxLength = 0;

        // input: "abcabcaa"
        for(int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(map.containsKey(ch)) { /* ch = a */
                left = Math.max(left, map.get(ch) + 1); /* left = 4 */
            }

            //  a --> b --> c
            map.put(ch, i);

            // 3 --> 3
            maxLength = Math.max(maxLength, i - left + 1); // (3, 3-4+1 = 0))
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }
}