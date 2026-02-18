package stage2a_dsa_foundations;

import java.util.Arrays;

public class ZeroesToEnd {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = { 0, 1, 2};
        int temp;
        for (int i = 0; i < arr.length   ; i++) {
            for (int j = 0; j < arr.length - 1  ; j++) {
                if(arr[j] == 0){
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j+1] = temp;
                }
            }
        }


        System.out.println(Arrays.toString(arr));
    }
}
