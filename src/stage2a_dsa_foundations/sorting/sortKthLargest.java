package stage2a_dsa_foundations.sorting;

public class sortKthLargest {
    public static int findKthLargest(int[] arr, int k){
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        return arr[arr.length - k];
    }
    public static void main(String[] args) {
        // Write your solution here
        int [] arr = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k = 4;
        int result = findKthLargest(arr, k);
        System.out.println(result);
    }
}
