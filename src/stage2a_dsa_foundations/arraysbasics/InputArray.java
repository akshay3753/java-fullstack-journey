package stage2a_dsa_foundations.arraysbasics;

import java.util.Arrays;
import java.util.Scanner;



public class InputArray {
    public static void main(String[] args) {
        // Write your solution here
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

            System.out.println(Arrays.toString(arr));

    }
}
