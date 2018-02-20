package hard;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MediaOofTwoSortedArraysTest
{
    @Test
    public void test()
    {
        MediaOofTwoSortedArrays s = new MediaOofTwoSortedArrays();
        Assert.assertEquals(s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3}), 2.0);
        Assert.assertEquals(s.findMedianSortedArrays(new int[]{}, new int[]{2, 3}), 2.5);
        Assert.assertEquals(s.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}), 2.5);
    }
}
