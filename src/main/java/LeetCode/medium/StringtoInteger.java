package LeetCode.medium;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringtoInteger
{
    public int myAtoi(String str)
    {
        String found = "";
        Matcher matcher = Pattern.compile("(([\\+\\-]+)?([^\\d\\+\\-]*)(\\d+))[^ ]?").matcher(str);
        
        if(matcher.find()) {
            String g2 = matcher.group(2);
            String g3 = matcher.group(3);
            String g4 = matcher.group(4);
            
            if(g2 != null && 1 < g2.length()
            || g2 != null && 0 < g2.length() && 0 < g3.length()
            || g2 == null && !g3.matches("[ ]+") && g3.matches("( *[\\w]+)")) {
                return 0;
            }
            
            found = g2 != null && g2.equals("-") ? "-" + g4 : g4;
        }
        
        if(found.length() != 0) {
            try {
                return Integer.parseInt(found);
            } catch(NumberFormatException $e) {
                if(found.matches("\\-.*")) {
                    return Integer.MIN_VALUE;
                }
    
                return Integer.MAX_VALUE;
            }
        }
        
        return 0;
    }
}
