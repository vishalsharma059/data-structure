package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaxSubStringWithoutRepeatingCharacter {
    public static int optimalApproach(String s) {
        int left = 0, result = 0;
        Set<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            result = Math.max(result, right - left + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(optimalApproach("abcabcbb")); // 3
        System.out.println(optimalApproach("bbbbb")); // 1
        System.out.println(optimalApproach("pwwkew")); // 3
        System.out.println(optimalApproach("")); // 0
        System.out.println(optimalApproach("abba")); // 2
        System.out.println(optimalApproach("tmmzuxt")); // 5
    }
}
