package leetcode.easy;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

public class TwoSumTest
{
    @Test
    public void test()
    {
        Model[] models = new Model[]{
                new Model().setArr(1, 2, 3, 4).setTarget(6).setExcept(1, 3),
                new Model().setArr(5, 5, 5).setTarget(10).setExcept(0, 1),
                new Model().setArr().setTarget(10).setExcept(0, 0),
                new Model().setArr(0).setTarget(0).setExcept(0, 0),
        };
        
        TwoSum s = new TwoSum();
        for(Model item : models) {
            int[] result = s.twoSum(item.getArr(), item.getTarget());
            Assert.assertEquals(result, item.getExcept(), item.toString() + "$" + Arrays.toString(result));
        }
    }
    
    private class Model
    {
        private int[] arr;
        private int   target;
        private int[] except;
        
        Model setArr(int... arr)
        {
            this.arr = arr;
            
            return this;
        }
        
        Model setTarget(int target)
        {
            this.target = target;
            
            return this;
        }
        
        Model setExcept(int... except)
        {
            this.except = except;
            
            return this;
        }
        
        int[] getArr()
        {
            return arr;
        }
        
        int getTarget()
        {
            return target;
        }
        
        int[] getExcept()
        {
            return except;
        }
        
        @Override
        public String toString()
        {
            return Arrays.toString(this.arr) + "{" + this.target + "}" + Arrays.toString(this.except);
        }
    }
}
