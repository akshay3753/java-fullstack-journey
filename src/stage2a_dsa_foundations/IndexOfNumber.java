package stage2a_dsa_foundations;

public class IndexOfNumber {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {10, 25, 3, 47, 8};
        int target = 99;
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println(i);
                found = true;
            }
        }
        if(found == false) {
            System.out.println(-1);
        }

    }
}
