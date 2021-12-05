package dataStructures;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        // 1. Create a collection
        ArrayList<String> cities = new ArrayList<String>();

        // 2. Add some elements
        cities.add("Cleveland");
        cities.add("Toronto");
        cities.add("Chicago");
        cities.add("Miami");
        cities.add("New York");

        // 3. Iterate the collection
        for (String city : cities){
            System.out.println(city);
        }

        // 4. Get the size
        int size = cities.size();
        System.out.println("\nThe list size is: " + size);

        // 5. retrieve specific element
        System.out.println(cities.get(2));

        // 6. Remove
        cities.remove(0);
        size = cities.size();
        System.out.println("\nNow the size is: "+ size);
        for(String city : cities){
            System.out.println(city);
        }
    }

}
