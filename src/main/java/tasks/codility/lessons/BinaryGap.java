package tasks.codility.lessons;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Codility Lesson #1
 */
class BinaryGap {
    int solution(int N) {
        int max = 0;
        
        Matcher matcher = Pattern.compile("(?<=1)0+(?=1)").matcher(Integer.toBinaryString(N));
        while (matcher.find()) {
            int temp = matcher.group().length();
            max = temp > max ? temp : max;
        }
        
        return max;
    }
}
