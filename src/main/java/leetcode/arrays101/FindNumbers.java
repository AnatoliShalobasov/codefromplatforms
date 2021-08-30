package leetcode.arrays101;

public class FindNumbers {

    public static int myFindNumbers(int[] nums) {
        int currentNumber;
        int currentCount = 0;
        int evenNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            currentNumber = nums[i];
            while (currentNumber != 0) {
                currentNumber /= 10;
                currentCount++;
            }
            if (currentCount % 2 == 0) {
                evenNumber++;
            }
            currentCount = 0;
        }

        return evenNumber;
    }

    public static int funnyMyFindNumbers(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] > 9 && nums[i] < 100) ||
                    (nums[i] > 999 && nums[i] < 10000) ||
                    nums[i] == 100000) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        System.out.println(myFindNumbers(new int[]{12, 345, 2, 6, 7896}));
    }
}
