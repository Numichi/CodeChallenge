package tasks.leetcode.easy;

class RemoveElement {
    int removeElement(int[] nums, int val) {
        if (nums.length == 0 || nums.length == 1 && nums[0] == val) {
            return 0;
        }

        if (nums.length == 1) {
            return 1;
        }

        int index = 0;
        int pointer = 0;

        while (pointer < nums.length) {
            if (nums[pointer++] != val) {
                nums[index++] = nums[pointer - 1];
            }
        }

        return index;
    }
}
