package stage2a_dsa_foundations;

public class RangeSum {

    public static int rangeSum(int[] arr, int left, int right) {
        // Step 1: Build prefix sum array
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
        // Step 2: Use prefix sum to calculate range sum in O(1)
        if (left == 0) {
            return prefix[right];
        } else {
            return prefix[right] - prefix[left - 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 3, 8};

        System.out.println(rangeSum(arr, 1, 3)); // Should print 12
        System.out.println(rangeSum(arr, 0, 2)); // Should print 8
        System.out.println(rangeSum(arr, 2, 5)); // Should print 18
    }
}