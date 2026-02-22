package stage2a_dsa_foundations.twopointers;

public class twoPointers {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 5, 6, 7, 12};
        int target = 12;
        int first = 0;
        int last = arr.length - 1;
        boolean found = false;
        while(first < last){
            int sum = arr[first] + arr[last];
            if(sum == target){
                found = true;
            }
            if(sum < target){
                first++;
            }else {
                last--;
            }
        }
        System.out.println(found);
    }
    }

