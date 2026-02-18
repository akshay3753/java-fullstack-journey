package stage2a_dsa_foundations;

public class TwoSum {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 3, 5, 7, 9};
        int target = 12;
        int left = 0;
        int right = arr.length - 1;
        int sum = 0;

        while (left < right) {
            sum = arr[left] + arr[right];
            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                break;
            }
            System.out.println(left + " " + right);
        }
    }
}
