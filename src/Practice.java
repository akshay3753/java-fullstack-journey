import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    public static void main(String[] args) {
       int[] mountain = {1, 3, 8, 12 , 4 , 2};
       int index = 0;
       int largest = mountain[0];
        for (int i = 0; i < mountain.length; i++) {
            if(mountain[i] > largest){
                largest = mountain[i];
                index = i;
            }
        }
        System.out.println(index);
    }
}
