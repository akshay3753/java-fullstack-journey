package stage2a_dsa_foundations;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {5 , 1, 6, 3};
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];  // Pick the element
            int j = i - 1;      // Start comparing with sorted part

// Shift elements to the right until we find the spot
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];  // Shift right
                j--;
            }
            arr[j + 1] = key;  // Insert the key in correct position
        }






        System.out.println(Arrays.toString(arr));
    }
}
