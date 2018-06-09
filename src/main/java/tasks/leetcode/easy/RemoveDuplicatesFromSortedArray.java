package tasks.leetcode.easy;

class RemoveDuplicatesFromSortedArray {
     int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int tempIndex = 0;
        for (int index = 1; index < nums.length; index++) {
            if (nums[tempIndex] != nums[index]) {
                tempIndex++;
                if (tempIndex != index) {
                    nums[tempIndex] = nums[index];
                }
            }
        }

        return tempIndex + 1;
    }
}
