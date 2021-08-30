package leetcode.arrays101;

import java.util.Arrays;

public class DuplicateZeros {

    public static void SEXduplicateZeros(int[] arr) {
        int possibleDups = 0;
        int length_ = arr.length - 1;

        // Find the number of zeros to be duplicated
        // Stopping when left points beyond the last element in the original array
        // which would be part of the modified array
        for (int left = 0; left <= length_ - possibleDups; left++) {

            // Count the zeros
            if (arr[left] == 0) {

                // Edge case: This zero can't be duplicated. We have no more space,
                // as left is pointing to the last element which could be included
                if (left == length_ - possibleDups) {
                    // For this zero we just copy it without duplication.
                    arr[length_] = 0;
                    length_ -= 1;
                    break;
                }
                possibleDups++;
            }
        }

        // Start backwards from the last element which would be part of new array.
        int last = length_ - possibleDups;

        // Copy zero twice, and non zero once.
        for (int i = last; i >= 0; i--) {
            if (arr[i] == 0) {
                arr[i + possibleDups] = 0;
                possibleDups--;
                arr[i + possibleDups] = 0;
            } else {
                arr[i + possibleDups] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    public static int[] duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) { //if we are on the last element it doesn't matter if it is non-zero or not
            if (arr[i] == 0) { //if we get a zero we shift everything from the back to the right by one
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++; //if we get a zero we need to shift 'i' twice to avoid running into the zero we just duplicated
            }
        }
        return arr;
    }

    public static void main(String[] args) {
       SEXduplicateZeros(new int[]{0, 0, 1, 2, 3, 0, 4, 5});
    }
}
