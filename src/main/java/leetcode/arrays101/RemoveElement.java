package leetcode.arrays101;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                nums[i] = nums[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(i);
        return i;

    }
//
//    int i = 0;
//    int n = nums.length;
//    while (i < n) {
//        if (nums[i] == val) {
//            nums[i] = nums[n - 1];
//            // reduce array size by one
//            n--;
//        } else {
//            i++;
//        }
//    }
//    return n;

    public static void main(String[] args) {
        removeElement(new int[]{1,1}, 1);
        removeElement(new int[]{3,2,2,3}, 3);
        removeElement(new int[]{3,3}, 3);
    }
}
