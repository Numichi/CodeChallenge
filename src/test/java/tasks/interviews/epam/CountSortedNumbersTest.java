package tasks.interviews.epam;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class CountSortedNumbersTest {
    private CountSortedNumbers countSortedNumbers;

    @BeforeClass
    public void setUpBeforeClass() {
        countSortedNumbers = new CountSortedNumbers();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataDefault() {
        return new Object[][] {
            { new int[] { 1, 2, 3, 4, 2, 3, 4, 5, 1, 2, 1 }, Arrays.asList(3, 3, 2, 2, 1) },
            { new int[] { 1, 1, 1, 1, 2, 2, 2, 2, 3, 3 }, Arrays.asList(4, 4, 2) },
            { new int[] { 6, 4, 3, 3, 3, 4 }, Arrays.asList(3, 2, 1) }
        };
    }

    @Test(dataProvider = "data-default")
    public void test(int[] input, List<Integer> expected) {
        Assert.assertEquals(countSortedNumbers.task(input), expected);
    }
}
