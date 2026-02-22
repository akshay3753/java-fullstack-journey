package stage2a_dsa_foundations.slidingwindow;

public class SlidingWindow {
    public static void main(String[] args) {
        // Write your solution here
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
//        int sum = 0;
//        int subArray = 0;
//        for (int i = 0; i < arr.length - k + 1; i++) {
//            subArray = 0;
//            for (int j = i; j < i + k; j++) {
//                subArray += arr[j];
//            }if(subArray > sum){
//                sum = subArray;
//            }
//        }
//        System.out.println(sum);
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }
        int sum = maxSum;
        for (int i = k; i < arr.length; i++) {
            sum += arr[i];
            sum -= arr[i -k];
            if(sum > maxSum){
                maxSum = sum;
        }
        }
        System.out.println(maxSum);
    }
}
