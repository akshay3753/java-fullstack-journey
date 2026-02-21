package stage2a_dsa_foundations;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {5, 4, 3, 2, 1};
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
            }
        }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
