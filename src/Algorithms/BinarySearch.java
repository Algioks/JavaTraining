package Algorithms;

public class BinarySearch {

    public static void main(String[] args) {

        int[] sortedNumbers = {1,5,9,12,18,23,58,98,102,999};

        //call the binary search
        int index = SearchMethodsForBinaryLinearBubble.binarySearch(sortedNumbers, 9, 102, sortedNumbers.length);
        System.out.println("Found at position: " + index);

    }
}

