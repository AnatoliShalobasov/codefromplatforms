package leetcode.arrays101;

public class MaxConsecutiveOnes {
    public static int myFindMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                maxCount = Math.max(maxCount, count);
                count = 0;
            }
        }

        return Math.max(maxCount, count);
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxSum = 0, sum = 0;
        for (int n : nums) {
            sum *= n;
            sum += n;
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 0, 1, 1, 1})); //3
        System.out.println(findMaxConsecutiveOnes(new int[]{0, 0, 0})); //0
        System.out.println(findMaxConsecutiveOnes(new int[]{0, 0, 0, 1})); //1
        System.out.println(findMaxConsecutiveOnes(new int[]{1, 1, 1, 1})); //4
    }
}
