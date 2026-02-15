package stage1d_collections;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        // Write your solution here
        ArrayList<Integer> numbers= new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        try{
            numbers.get(10);
        }catch (Exception e){
            System.out.println(e.getMessage() + " Index out of range");
        }finally {
            System.out.println("Program finished");
        }
    }
}
