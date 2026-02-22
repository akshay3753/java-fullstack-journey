package stage2a_dsa_foundations.arraysbasics;

public class LargestNumber {
    public static void main(String[] args) {
        // Write your solution here
        int[] array = {1, 2, 3, 4, 5};
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        System.out.println(largest);
    }
}
