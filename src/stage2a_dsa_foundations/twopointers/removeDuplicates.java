package stage2a_dsa_foundations.twopointers;

import java.util.Arrays;

public class removeDuplicates {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 1, 2, 3, 3, 4};
        // unique count = 4
        // array should be: [1, 2, 3, 4, ...]
        int index = 1; // start at 1, first element is always unique

        for(int i = 1; i < arr.length; i++){
            if(arr[i] != arr[i-1]){
                // current element is different from previous
                // place it at arr[index]
                arr[index] = arr[i];
                // increment index
                index++;
            }
        }

        System.out.println(index);
        System.out.println(Arrays.toString(arr));
    }
}
