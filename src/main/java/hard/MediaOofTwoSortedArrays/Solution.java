package hard.MediaOofTwoSortedArrays;

import java.util.Arrays;

public class Solution
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        System.arraycopy(nums1, 0, merged, 0,  nums1.length);
        System.arraycopy(nums2, 0, merged, nums1.length, nums2.length);
        Arrays.sort(merged);
        
        int half = merged.length / 2;
        if(merged.length % 2 == 0) {
            return  (merged[half] + merged[half - 1]) / 2.0;
        }
        
        return (double) merged[half];
    }
}
