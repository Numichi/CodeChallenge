package easy;

import easy.RemoveDuplicatesFromSortedArray.Solution;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArrayTest
{
    private Solution s;
    
    @Test
    public void test()
    {
        this.s = new Solution();
        
        this.item(new int[]{1, 1, 2}, 2, new int[]{1, 2});
        this.item(new int[]{1, 1, 2, 3}, 3, new int[]{1, 2, 3});
        this.item(new int[]{1, 1, 2, 3, 3}, 3, new int[]{1, 2, 3});
        this.item(new int[]{1, 1}, 1, new int[]{1});
    }
    
    private void item(int[] input, int exp, int[] expArr)
    {
        int result = s.removeDuplicates(input);
        Assert.assertEquals(result, exp);
        Assert.assertEquals(Arrays.copyOfRange(this.s.nums, 0, result), expArr);
    }
}
