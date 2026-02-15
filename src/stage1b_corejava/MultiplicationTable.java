package stage1b_corejava;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        // Write your solution here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= 10; i++) {
            int answer = number * i;
            System.out.println(number + " * " + i + " = " + answer);
        }
    }
}
