package medium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ContainerWithMostWaterTest
{
    @Test
    public void test()
    {
        ContainerWithMostWater s = new ContainerWithMostWater();
        Assert.assertEquals(s.maxArea(new int[]{2, 2, 100, 100, 2}), 100);
        Assert.assertEquals(s.maxArea(new int[]{2, 100, 2, 100, 2}), 200);
        Assert.assertEquals(s.maxArea(new int[]{100, 2, 2, 100, 2}), 300);
        Assert.assertEquals(s.maxArea(new int[]{2, 100, 2, 100, 100}), 300);
        Assert.assertEquals(s.maxArea(new int[]{2, 100, 100, 100, 100}), 300);
    }
}
