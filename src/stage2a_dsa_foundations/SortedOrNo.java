package stage2a_dsa_foundations;

public class SortedOrNo {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 2, 3, 4, 5};
        boolean sorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i+1]){
                sorted = false;
                break;
            }
        }
        System.out.println(sorted);
    }
}
