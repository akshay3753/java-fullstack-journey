package stage2a_dsa_foundations.twopointers;

public class ContainerWater {
    public static void main(String[] args) {
        // Write your solution here
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = height.length - 1;

        int maxArea = 0;
        while (left < right){
            int currentArea = (right - left) * Math.min(height[left], height[right]);
            if(maxArea < currentArea){
                maxArea = currentArea;
            }
            if(height[left] < height[right]){
                left++;
            }else{
                right--;
            }
        }
        System.out.println(maxArea);
    }
}
