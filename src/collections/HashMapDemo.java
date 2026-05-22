package collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {

        // ********** Hash Maps in java **********

        //HashMap== A data structures that stores the key value pairs
        //          Keys are unique but values can be duplicated
        //          Does not maintain any order but is memory efficient
        //          HashMap<Key ,value>

            HashMap<String ,Double> hashMap = new HashMap<>();

            hashMap.put("Pen",0.53);
            hashMap.put("Pencil",0.1);
            hashMap.put("Erraser",2.02);
            hashMap.put("Sharpner",0.1);

            hashMap.put("Pencil",10.3333);

            //hashMap.remove("Erraser");

            System.out.println(hashMap.get("Pencil"));
            System.out.println(hashMap.containsKey("Pencil"));

            if(hashMap.containsKey("Sharpner")){
                System.out.println(hashMap.get("Pen"));
            }
            else {
                System.out.println("Key not found");
            }
            System.out.println(hashMap.size());

            for (String key : hashMap.keySet()) {
                System.out.println(key + " : " + hashMap.get(key));
            }
    }
}
