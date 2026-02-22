package stage2a_dsa_foundations.binarysearch;

public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if target is at mid
            if(target == arr[mid]){
                return mid;
            }
            // If target is greater, search right half
            else if(target > arr[mid]){
                left = mid + 1;

            }
            // If target is smaller, search left half
            else {
                right = mid - 1;
            }
        }

        return -1;  // Not found
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 3, 5, 7, 9 , 11};
        int target = 1;
        int result = binarySearch(arr, target);
        System.out.println(result);
    }
}
