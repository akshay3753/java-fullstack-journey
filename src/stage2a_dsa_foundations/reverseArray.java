package stage2a_dsa_foundations;

import java.util. Arrays;

public class reverseArray {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 2, 3, 4, 5};
            int first_digit = 0;
            int last_digit = arr.length - 1;
            int temp;
            while(first_digit < arr.length / 2){
                temp = arr[first_digit];
                arr[first_digit] = arr[last_digit];
                arr[last_digit] = temp;
                first_digit++;
                last_digit--;
            }
        System.out.println(Arrays.toString(arr));
        }
    }

