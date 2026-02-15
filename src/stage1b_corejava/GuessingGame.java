package stage1b_corejava;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        // Write your solution here
        int secret = 42;
        Scanner sc = new Scanner(System.in);
        int number = -1;

        while(number != secret){
            System.out.print("Guess the Number: ");
            number = sc.nextInt();
            if(number == secret){
                System.out.println("Correct! You got it");
            }else if(number < secret){
                System.out.println("Too low");
            }else{
                System.out.println("Too high");
            }
        }
    }
}
