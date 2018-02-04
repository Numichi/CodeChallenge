package easy.PalindromeNumber;

import java.util.List;

class Solution {
    public boolean isPalindrome(int x) {
        String y = Integer.toString(x);

        int early = 0;
        int over = y.length() - 1;

        while(early < over) {
            if(y.charAt(early++) != y.charAt(over--)) {
                return false;
            }
        }

        return true;
    }
}
