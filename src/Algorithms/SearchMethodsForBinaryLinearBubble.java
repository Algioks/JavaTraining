package Algorithms;

public class SearchMethodsForBinaryLinearBubble {

    public static int linearSearch(int[] dataSet, int target) {

        //iterate through data set searching for target
        for (int i = 0; i < dataSet.length; i++) {
            if (dataSet[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] dataSet, int target, int start, int end) {

        //binary search assumes a sorted array and can therefore continually split our search domain in half
        int midpoint = (int)Math.floor((start+end)/2);
        System.out.println("Midpoint: " + midpoint);
        int value = dataSet[midpoint];

        if (target > value){
            return binarySearch(dataSet, target, midpoint +1, end);
        } else if (target < value){
            return binarySearch(dataSet, target, start, midpoint-1);
        }
        System.out.println(target + " = " + value);
        return midpoint;
    }

}
