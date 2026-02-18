package stage2a_dsa_foundations;

public class MaxOnesPro {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 1, 0, 0, 1, 1, 1, 0, 1};
        int k = 2;
        int left = 0;
        int zeroCount = 0;
        int maxLen = 0;
        for (int right = 0; right  < arr.length; right++) {
            if(arr[right] == 0){
                zeroCount++;
            }
            if(zeroCount > k){
                if(arr[left] == 0){
                    zeroCount--;
                }
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.println(maxLen);
    }
}
