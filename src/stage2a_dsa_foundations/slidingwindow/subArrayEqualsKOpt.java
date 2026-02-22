package stage2a_dsa_foundations.slidingwindow;

import java.util.HashMap;

public class subArrayEqualsKOpt {
    public static int subarraySum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);
        int count = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if(map.containsKey(sum - k)){
                count++;
            }
            map.put(sum,map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {9, 2, 3, 4, 5};
        System.out.println(subarraySum(arr, 9));
    }
}
