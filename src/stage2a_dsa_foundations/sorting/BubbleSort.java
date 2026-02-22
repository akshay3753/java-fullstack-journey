package stage2a_dsa_foundations.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {5 , 1, 4, 3, 8};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
