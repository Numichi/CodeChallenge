package easy;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RomanToIntegerTest
{
    @Test
    public void test() {
        Object[][] arr = {
            {"I", 1},
            {"IV", 4},
            {"VI", 6},
            {"XX", 20},
            {"DCCCXCVIII", 898},
            {"MMXVIII", 2018},
            {"MMCMLXXI", 2971},
        };

        RomanToInteger s = new RomanToInteger();
        for(Object[] item : arr) {
            Assert.assertEquals(
                s.romanToInt((String) item[0]),
                (int) item[1]
            );
        }
    }
}
