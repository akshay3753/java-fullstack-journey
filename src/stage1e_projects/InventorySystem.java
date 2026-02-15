package stage1e_projects;


import java.util.HashMap;

public class InventorySystem {

        String name;
        double price;
        int quantity;

        InventorySystem(String name, double price, int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

    public static void main(String[] args) {
        // Write your solution here
//        HashMap<String, Integer> inventory = new HashMap<>();
//        inventory.put("Rice", 1);
//                for(String key: inventory.keySet()){
//                    System.out.println(key + " : " + inventory.get(key));
//                }

        InventorySystem item1 = new InventorySystem("Rice", 200, 2);
        InventorySystem item2 = new InventorySystem("Dal", 300, 4);
        InventorySystem item3 = new InventorySystem("Curd", 30 , 1);

        HashMap<String , InventorySystem> inventory = new HashMap<>();
        inventory.put(item1.name, item1);
        inventory.put(item2.name, item2);
        inventory.put(item3.name, item3);

        for(String key : inventory.keySet()){
            InventorySystem item = inventory.get(key);
            System.out.println(item.name + " Price: " + item.price + " Quantity: " + item.quantity);
        }
        inventory.remove("Dal");
        for(String key : inventory.keySet()){

            InventorySystem item = inventory.get(key);
            System.out.println(item.name + " Price: " + item.price + " Quantity: " + item.quantity);
        }

        }
    }

