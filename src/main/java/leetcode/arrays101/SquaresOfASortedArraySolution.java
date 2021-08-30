package leetcode.arrays101;

import javax.sound.midi.Soundbank;
import java.util.Arrays;

public class SquaresOfASortedArraySolution {
    public static int[] sortedSquares(int[] nums) {

        int fromStart = 0;
        int fromEnd = nums.length - 1;
        int indexForNewArray =  nums.length - 1;
        int[] resultSortArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (Math.abs(nums[fromStart]) > Math.abs(nums[fromEnd])) {
                resultSortArray[indexForNewArray--] = nums[fromStart] * nums[fromStart];
                fromStart++;
            } else {
                resultSortArray[indexForNewArray--] = nums[fromEnd] * nums[fromEnd];
                fromEnd--;
            }
        }

        return resultSortArray;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sortedSquares(new int[]{-4, -1, 0, 2, 3})));
    }
}
