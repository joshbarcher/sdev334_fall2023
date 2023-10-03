package queues;

import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * A priority queue based on a binary heap.
 */
public class PriorityQueue implements IPriorityQueue
{
    private static final int INIT_CAPACITY = 10;
    private int[] heap;

    //this is the number of elements in the queue,
    //and the next unused index in the heap array
    private int size;

    public PriorityQueue()
    {
        //initial capacity is 10 elements
        heap = new int[INIT_CAPACITY];
    }

    @Override
    public void add(int element)
    {
        //what if we run out of space?
        if (size == heap.length)
        {
            resize();
        }

        heap[size] = element;

        //reorder the heap
        swim(size);

        size++;
    }

    private void resize()
    {
        //double the capacity
        int[] newHeap = new int[heap.length * 2];

        //copy over all elements
        for (int i = 0; i < heap.length; i++)
        {
            newHeap[i] = heap[i];
        }

        //then replace the heap
        heap = newHeap;
    }

    private void swim(int curIndex)
    {
        while (curIndex > 0)
        {
            int parIndex = (curIndex - 1) / 2;

            //if out of order
            if (heap[curIndex] < heap[parIndex])
            {
                swap(curIndex, parIndex);

                //move up the tree
                curIndex = parIndex;
            }
            else
            {
                break; //short-circuit
            }
        }
    }

    private void swap(int first, int second)
    {
        int temp = heap[first];
        heap[first] = heap[second];
        heap[second] = temp;
    }

    @Override
    public int remove()
    {
        //is the heap empty
        if (size == 0)
        {
            throw new NoSuchElementException("The heap is empty");
        }

        //save my return value and move the last element in the heap to the root
        int result = heap[0];
        heap[0] = heap[size - 1];
        heap[size - 1] = 0;

        size--;
        sink(0);

        return result;
    }

    private void sink(int curIndex)
    {
        int highestIndexWithChild = (size / 2) - 1;

        //loop while the current index has a child
        while (curIndex <= highestIndexWithChild)
        {
            int leftIndex = 2 * curIndex + 1;
            int rightIndex = 2 * curIndex + 2;

            //find the smallest child of the current index
            int smallestIndex = leftIndex;
            if (rightIndex < size &&
                heap[leftIndex] > heap[rightIndex]) //is the right child smaller than the left
            {
                smallestIndex = rightIndex;
            }

            //swap if out of order
            if (heap[curIndex] > heap[smallestIndex])
            {
                swap(curIndex, smallestIndex);

                //move down the tree
                curIndex = smallestIndex;
            }
            else
            {
                break; //short-circuit - the elements are in order!
            }
        }
    }

    @Override
    public int peek()
    {
        return 0;
    }

    @Override
    public int size()
    {
        return size;
    }

    @Override
    public boolean isEmpty()
    {
        return size == 0;
    }

    @Override
    public void clear()
    {

    }

    @Override
    public String toString()
    {
        return Arrays.toString(heap);
    }
}
