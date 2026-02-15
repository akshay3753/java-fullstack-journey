package stage1d_collections;

import java.util.ArrayList;

public class employee {
    public static void main(String[] args) {
        // Write your solution here
        ArrayList<String > names = new ArrayList<>();
        names.add("sdafj");
        names.add("afds");
        names.add("fad");
        names.add("dfshadsa");
        for(String name : names){
            System.out.println(name);
        }
        names.remove("fad");
        System.out.println(names);
        names.size();


        System.out.println(names.size());
        System.out.println(names.get(0));
        System.out.println(names.contains("Raj"));
    }
}
