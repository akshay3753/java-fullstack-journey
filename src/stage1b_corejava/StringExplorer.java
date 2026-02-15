package stage1b_corejava;

import java.util.Scanner;

public class StringExplorer {
    public static void main(String[] args) {
        // Write your solution here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.println("Length: " + sentence.length());
        System.out.println("Uppercase: " + sentence.toUpperCase());
        System.out.println("Lowercase: " + sentence.toLowerCase());
        System.out.println("First character: " + sentence.charAt(0));
        System.out.println("Contains 'name': " + sentence.contains("name"));

    }
}
