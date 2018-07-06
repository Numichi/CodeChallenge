package tasks.leetcode.medium;

public class LongestPalindromicSubstring {
    private String found = "";
    private String string = "";
    
    public String longestPalindrome(String s) {
        found = "";
        string = s;
        int[] arr0;
        int[] arr1;
        
        for (int i = 0; i < string.length(); i++) {
            arr0 = getPalindrome(i, false);
            arr1 = getPalindrome(i, true);
            check(Math.min(arr0[0], arr1[0]), Math.max(arr0[1], arr1[1]));
        }
        
        return found;
    }
    
    private int[] getPalindrome(
        int i,
        boolean move
    ) {
        int j = i;
        
        if (move) {
            j++;
        }
        
        while (0 <= i && j < string.length() && string.charAt(i) == string.charAt(j)) {
            i--;
            j++;
        }
        
        return new int[] {
            ++i,
            --j
        };
    }
    
    private void check(
        int a,
        int b
    ) {
        if (0 <= a && 0 <= b && found.length() < b - a + 1) {
            found = string.substring(a, b + 1);
        }
    }
}
