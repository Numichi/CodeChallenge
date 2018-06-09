package tasks.leetcode.hard;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MediaOofTwoSortedArraysTest {
    private MediaOofTwoSortedArrays mediaOofTwoSortedArrays;

    @BeforeClass
    public void setUpBeforeClass() {
        mediaOofTwoSortedArrays = new MediaOofTwoSortedArrays();
    }

    @DataProvider(name = "data-default")
    public Object[][] dataProvider() {
        return new Object[][] {
            { new int[] { 1, 2 }, new int[] { 3 }, 2.0 },
            { new int[] {}, new int[] { 2, 3 }, 2.5 },
            { new int[] { 1, 2 }, new int[] { 3, 4 }, 2.5 },
        };
    }

    @Test(dataProvider = "data-default")
    public void test(int[] p1, int[] p2, double expected) {
        Assert.assertEquals(mediaOofTwoSortedArrays.findMedianSortedArrays(p1, p2), expected);
    }
}
