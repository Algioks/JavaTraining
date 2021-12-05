package dataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {

    public static void main(String[] args) {

        //implement map interfaces
        Map<Integer, String> hMap = new TreeMap<Integer, String>();
        mapUtil(hMap);



    }

    public static void mapUtil(Map<Integer, String> map){

        // 1. add Key-Value pairs
        map.put(101, "Steve");
        map.put(502, "Roger");
        map.put(22, "Tom");
        map.put(315, "Steve");
        map.put(320, "Ellie");
        map.put(850, "Kelly");

        // 2. Expose / access elements
        System.out.println("See all the keys: "+ map.keySet());
        System.out.println("See all key-value pairs: " + map);
        //System.out.println(map.get(502));

        // 3. Iterate through map of key-value pairs?
        for (int key: map.keySet()){
            System.out.println("[KEY: " + key + ". VALUE: " + map.get(key) + " ]");
        }
    }

}
