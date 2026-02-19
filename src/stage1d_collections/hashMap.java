package stage1d_collections;

import java.util.HashMap;

public class hashMap {
    public static void main(String[] args) {
        // Write your solution here
        HashMap<String, Integer> salaries = new HashMap<>();
        salaries.put("Raj", 90000);
        salaries.put("Aishaa", 74000);
        salaries.put("Prakash", 80003);

        for(String name: salaries.keySet()){
            System.out.println( name + ": " + salaries.get(name));
        }
        System.out.println(salaries.get("Raj"));
    }
}
