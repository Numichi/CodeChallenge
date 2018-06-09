package tasks.leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RemoveDuplicatesFromSortedArrayTest {
    private RemoveDuplicatesFromSortedArray removeDuplicates;

    @BeforeClass
    public void setUpBeforeClass() {
        removeDuplicates = new RemoveDuplicatesFromSortedArray();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            { new int[] { 1, 1, 2 }, 2 },
            { new int[] { 1, 1, 2, 3 }, 3 },
            { new int[] { 1, 1, 2, 3, 3 }, 3 },
            { new int[] { 1, 1 }, 1 },
        };
    }

    @Test(dataProvider = "data-default")
    public void test(int[] input, int expected) {
        Assert.assertEquals(removeDuplicates.removeDuplicates(input), expected);
    }
}
