package stage1b_corejava;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        // Write your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? : ");
        int number = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int[] arraySize = new int[number];
        for (int i = 0; i < arraySize.length; i++) {
            System.out.print("Enter number  " + (i + 1) + " :");
            int currentNumber = sc.nextInt();
            if(currentNumber > largest){
                largest = currentNumber;
            }
        }
        System.out.println("Largest : " + largest);
    }
}
