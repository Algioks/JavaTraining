package dataStructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        // LinkedHash - in order that they were entered
        // HashSet - complete random order
        // TreeSet - rearranges to natural order

        // 1. Define the collection
        Set<String> animals = new LinkedHashSet<String>();

        // 2. Add elements
        animals.add("dog");
        animals.add("pig");
        animals.add("cat");
        animals.add("snake");
        animals.add("hog");
        System.out.println( animals.size() + "" + animals + "\n");

        animals.add("dog");
        animals.add("pig");
        animals.add("goose");
        System.out.println( animals.size() + "" + animals + "\n");

        // 3.Create a new set that we use for comparison
        Set<String> farmAnimals = new HashSet<String>();
        farmAnimals.add("chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("horse");
        farmAnimals.add("dog");

        //What is the intersection between animals and farm animals?
        // only animals and farm animals "AND"
        // 1. Copy existing set into a new set
        Set<String> intersectionSet = new HashSet<String>(animals);
        System.out.println(intersectionSet);

        // 2. retain ONLY the elements that are also in the other set
        intersectionSet.retainAll((farmAnimals));
        System.out.println("The intersection is: " + intersectionSet);

        //WHAT IS UNION? HOW TO DO IT? (farm and farm animals )
        Set<String> unionSet = new HashSet<String>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("The union is: " + unionSet);


        //WHAT IS THE DIFFERENCE?  (animals but NOT farm animals)
        Set<String> differenceSet = new HashSet<String>(animals);
        differenceSet.removeAll(farmAnimals);
        System.out.println("The difference is: " + differenceSet);

    }

}
