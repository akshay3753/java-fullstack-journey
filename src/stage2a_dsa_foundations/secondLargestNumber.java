package stage2a_dsa_foundations;

public class secondLargestNumber {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {10, 25, 3, 35, 78, 97};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest) {
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
