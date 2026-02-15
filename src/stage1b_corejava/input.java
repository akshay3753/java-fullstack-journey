package stage1b_corejava;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        // Write your solution here
          Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.println("Name: " + name);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Age: " + age);

        System.out.print("Enter your city: ");
        String city = sc.nextLine();
        System.out.print("City: " + city);
        sc.close();

    }
}
