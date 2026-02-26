package stage2a_dsa_foundations.twopointers;

import java.util.Arrays;

public class ZeroesToEndOofN {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {0, 1, 4, 0, 5, 2};
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[index] = arr[i];
                index++;
            }
        }
        for (int i = index; i < arr.length ; i++) {
            arr[i] = 0;

        }
        System.out.println(Arrays.toString(arr));
    }
}
