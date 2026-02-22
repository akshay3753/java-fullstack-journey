package stage2a_dsa_foundations.slidingwindow;

public class subArrayEqualsK {
    public static int subarraySum(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == k){
                    count++;
                }
            }
        }
        return  count;
    }
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(subarraySum(arr, 9)); // Should print 2
    }
}
