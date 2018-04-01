package LeetCode.easy;

public class PalindromeNumber
{
    public boolean isPalindrome(int x)
    {
        String str = Integer.toString(x);

        int early = 0;
        int over = str.length() - 1;

        while(early < over) {
            if(str.charAt(early++) != str.charAt(over--)) {
                return false;
            }
        }

        return true;
    }
}
