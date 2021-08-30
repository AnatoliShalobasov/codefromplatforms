package leetcode.arrays101;

import java.util.Arrays;

public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int len = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[len] = nums[i];
                len++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return len;
    }

    public static void main(String[] args) {
        removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 2, 3, 6, 7, 7, 8});
    }
}
