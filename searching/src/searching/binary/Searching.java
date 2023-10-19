package searching.binary;

public class Searching
{
    public static int recursiveBS(int[] array, int search)
    {
        return recursiveBS(array, search, 0, array.length - 1);
    }

    private static int recursiveBS(int[] array, int search,
                                   int low, int high)
    {
        //base case
        if (low > high)
        {
            return -1;
        }

        int mid = (high + low) / 2;
        if (array[mid] == search) //base case
        {
            //return the index where we found the element
            return mid;
        }
        else if (array[mid] < search)
        {
            //low -> mid + 1
            return recursiveBS(array, search, mid + 1, high);
        }
        else
        {
            //high -> mid - 1
            return recursiveBS(array, search, low, mid - 1);
        }
    }

    public static int binarySearch(int[] array, int search)
    {
        int low = 0;
        int high = array.length - 1;

        //continue while low and high are in the correct order
        while (low <= high)
        {
            int mid = (high + low) / 2;

            if (array[mid] == search)
            {
                //return the index where we found the element
                return mid;
            }
            else if (array[mid] < search)
            {
                low = mid + 1;
            }
            else
            {
                high = mid - 1;
            }
        }

        //not found!
        return -1;
    }
}
