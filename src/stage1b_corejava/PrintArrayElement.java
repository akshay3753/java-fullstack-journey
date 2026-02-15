package stage1b_corejava;

public class PrintArrayElement {
    public static void main(String[] args) {
        // Write your solution here
        int[] numbers ={10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            sum = sum + numbers[i];
        }
        System.out.println("Sum: " + sum);

    }
}
