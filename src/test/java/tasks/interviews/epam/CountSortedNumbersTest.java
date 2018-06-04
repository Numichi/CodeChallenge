package tasks.interviews.epam;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class CountSortedNumbersTest
{
    @Test
    public void test() {
        CountSortedNumbers s = new CountSortedNumbers();
        Assert.assertEquals(s.task(1, 2, 3, 4, 2, 3, 4, 5, 1, 2, 1), new ArrayList<>(Arrays.asList(3, 3, 2, 2, 1)));
        Assert.assertEquals(s.task(1, 1, 1, 1, 2, 2, 2, 2, 3, 3), new ArrayList<>(Arrays.asList(4, 4, 2)));
        Assert.assertEquals(s.task(6, 4, 3, 3, 3, 4), new ArrayList<>(Arrays.asList(3, 2, 1)));
    }
}
