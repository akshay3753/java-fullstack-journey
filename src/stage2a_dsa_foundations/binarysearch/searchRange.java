package stage2a_dsa_foundations.binarysearch;

import java.util.Arrays;

public class searchRange {

    public static int findFirst(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;       // Found it, but keep searching LEFT
                right = mid - 1;    // Keep searching left side
            }
            else if (target > arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int findLast(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;       // Found it, but keep searching RIGHT
                left = mid + 1;     // Keep searching right side
            }
            else if (target > arr[mid]) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }

        return result;
    }

    public static int[] searchRange(int[] arr, int target) {
        int first = findFirst(arr, target);
        int last = findLast(arr, target);
        return new int[]{first, last};
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 8, 10};
        int target = 8;

        int[] result = searchRange(arr, target);
        System.out.println(Arrays.toString(result));  // Should print [3, 5]

        // Test case 2: not found
        int[] result2 = searchRange(arr, 6);
        System.out.println(Arrays.toString(result2));  // Should print [-1, -1]
    }
}