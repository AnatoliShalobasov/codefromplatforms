package leetcode.arrays101;

import java.util.Arrays;

public class MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int lastPointerF = m - 1;
        int lastPointerS = n - 1;
        int pointerMerge = m + n - 1;

        while (lastPointerF != -1 && lastPointerS != -1) {
            if (nums1[lastPointerF] > nums2[lastPointerS]) {
                nums1[pointerMerge--] = nums1[lastPointerF--];
            } else {
                nums1[pointerMerge--] = nums2[lastPointerS--];
            }
        }
        while (lastPointerS != -1) {
            nums1[pointerMerge--] = nums2[lastPointerS--];
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        merge(new int[]{1, 2, 3, 0, 0, 0}, 3, new int[]{2, 5, 6}, 3);
        merge(new int[]{1}, 1, new int[]{}, 0);
        merge(new int[]{0}, 0, new int[]{1}, 1);
    }
}
