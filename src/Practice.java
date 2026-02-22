import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 0, 8, 0, 5, 0, 7};
        int insertPos = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                arr[insertPos] = arr[i];
                insertPos++;
            }
        }
        for (int i = insertPos; i < arr.length; i++) {
            arr[i] = 0;
        }

        System.out.println(Arrays.toString(arr));
    }
}
