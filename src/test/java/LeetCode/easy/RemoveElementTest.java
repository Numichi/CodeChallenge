package LeetCode.easy;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.Arrays;

public class RemoveElementTest
{
    @Test
    public void testMy()
    {
        RemoveElement s = new RemoveElement();
        int result;
        
        // Input: [3, 3] (5)
        // Output: [3, 3] (2)
        result = s.removeElement(new int[]{3, 3}, 5);
        Assert.assertEquals(result, 2);
        Assert.assertEquals(Arrays.copyOfRange(s.nums, 0, result), new int[]{3, 3});
    
        // Input: [5, 5, 5, 5] (5)
        // Output: [] (0)
        result = s.removeElement(new int[]{5, 5, 5, 5}, 5);
        Assert.assertEquals(result, 0);
        Assert.assertEquals(Arrays.copyOfRange(s.nums, 0, result), new int[]{});
    
        // Input: [3, 2, 2, 3] (3)
        // Output: [2, 2] (2)
        result = s.removeElement(new int[]{3, 2, 2, 3}, 3);
        Assert.assertEquals(result, 2);
        Assert.assertEquals(Arrays.copyOfRange(s.nums, 0, result), new int[]{2, 2});
    
        // Input: [2, 2, 2] (0)
        // Output: [2, 2, 2] (3)
        result = s.removeElement(new int[]{2, 2, 2}, 0);
        Assert.assertEquals(result, 3);
        Assert.assertEquals(Arrays.copyOfRange(s.nums, 0, result), new int[]{2, 2, 2});
    
        // Input: [1, 2, 3, 4, 5, 6, 7] (3)
        // Output: [1, 2, 4, 5, 6, 7] (6)
        result = s.removeElement(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
        Assert.assertEquals(result, 6);
        Assert.assertEquals(Arrays.copyOfRange(s.nums, 0, result), new int[]{1, 2, 4, 5, 6, 7});
    }
}
