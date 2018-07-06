package tasks.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

class LongestSubstringWithoutRepeatingCharacters {
    int lengthOfLongestSubstring(String s) {
        int size = s.length();
        Set<Character> set = new HashSet<>();
        String substr = "";
        
        for (int i = 0; i < size; i++) {
            int j;
            set.clear();
            set.add(s.charAt(i));
            
            for (j = i + 1; j < size; j++) {
                if (set.contains(s.charAt(j))) {
                    break;
                }
                
                set.add(s.charAt(j));
            }
            
            String result = s.substring(i, j);
            
            if (result.length() > substr.length()) {
                substr = result;
            }
        }
        
        return substr.length();
    }
}
