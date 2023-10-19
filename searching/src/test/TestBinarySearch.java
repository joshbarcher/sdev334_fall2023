package test;

import searching.binary.Searching;
import utility.SearchingUtilities;

import java.util.Arrays;

public class TestBinarySearch
{
    public static void main(String[] args)
    {
        //test array
        int[] testArray = SearchingUtilities.generateRandomArray(20, 1, 20);

        //sort the array (required)
        Arrays.sort(testArray);
        System.out.println(Arrays.toString(testArray));

        //search for an element
        System.out.println("bs(10): " + Searching.binarySearch(testArray, 10));
    }
}
