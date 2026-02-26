import java.util.Arrays;


public class Practice {
    public static void main(String[] args) {
        int[] nums = {1, 0, 8, 0, 5, 0, 7};
        int k = 3;
        int rotate = k % nums.length;
        int temp = nums[0];
        for (int i = 0; i < rotate; i++) {
            for(int j = 0; j < nums.length - 1; j++){
                nums[j] = nums[j+ 1];
            }
        }
        
        System.out.print(Arrays.toString(nums));
    }
}
