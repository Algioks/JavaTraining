package Algorithms;

public class LinearSearch {

    public static void main(String[] args) {

        int[] numbers = {10, 12,15,48,789,53,45,65,69,96};

        //call a function that searches for specific number
        int pos = SearchMethodsForBinaryLinearBubble.linearSearch(numbers, 96);
        System.out.println("Found at position: " + pos);

    }
}

