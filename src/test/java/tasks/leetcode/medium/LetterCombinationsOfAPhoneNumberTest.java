package tasks.leetcode.medium;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class LetterCombinationsOfAPhoneNumberTest
{
    @Test
    public void test()
    {
        LetterCombinationsOfAPhoneNumber s = new LetterCombinationsOfAPhoneNumber();
        
        Map<String, List<String>> tests = new HashMap<>();
        tests.put("2", new ArrayList<>(Arrays.asList("a", "b", "c")));
        tests.put("23", new ArrayList<>(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf")));
        tests.put("234",
                  new ArrayList<>(Arrays.asList("adh", "adg", "adi", "aeh", "aeg", "aei", "afh", "afg", "afi",
                                                "bdh", "bdg", "bdi", "beh", "beg", "bei", "bfh", "bfg", "bfi",
                                                "cdh", "cdg", "cdi", "ceh", "ceg", "cei", "cfh", "cfg", "cfi")
                  )
        );
        
        for(Map.Entry<String, List<String>> e : tests.entrySet()) {
            List<String> res = s.letterCombinations(e.getKey());
            Assert.assertEquals(e.getValue(), res);
        }
    }
}
