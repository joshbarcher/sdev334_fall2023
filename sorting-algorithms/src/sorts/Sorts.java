package sorts;

import utility.SortingUtilities;

public class Sorts
{
    public static void bubbleSort(Comparable[] array)
    {

        //for each pass over the array
        for (int i = 0; i < array.length; i++)
        {
            //for each pair of adjacent elements
            for (int j = 0; j < array.length - 1; j++)
            {
                //swap if out of order!
                if (array[j].compareTo(array[j + 1]) > 0)
                {
                    SortingUtilities.swap(array, j, j + 1);
                }
            }
        }
    }
}
