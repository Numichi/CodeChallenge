package leetcode.medium;


import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters
{
    public static void main(String[] arg)
    {
        LongestSubstringWithoutRepeatingCharacters task = new LongestSubstringWithoutRepeatingCharacters();

        System.out.println(task.lengthOfLongestSubstring("abcabcbb") == 3);
        System.out.println(task.getSubstr().equals("abc"));

        System.out.println(task.lengthOfLongestSubstring("bbbbb") == 1);
        System.out.println(task.getSubstr().equals("b"));

        System.out.println(task.lengthOfLongestSubstring("pwwkew") == 3);
        System.out.println(task.getSubstr().equals("wke"));
    }

    public String getSubstr()
    {
        return substr;
    }

    private String substr = "";

    public int lengthOfLongestSubstring(String s)
    {
        int size = s.length();
        Set<Character> set = new HashSet<>();
        this.substr = "";

        for(int i = 0; i < size; i++) {
            int j;
            set.clear();
            set.add(s.charAt(i));

            for(j = i + 1; j < size; j++) {
                if(set.contains(s.charAt(j))) {
                    break;
                }

                set.add(s.charAt(j));
            }

            String result = s.substring(i, j);

            if(result.length() > this.substr.length()) {
                this.substr = result;
            }
        }

        return this.substr.length();
    }
}
