package test;

import queues.PriorityQueue;

public class Main
{
    public static void main(String[] args)
    {
        PriorityQueue heap = new PriorityQueue();
        int[] elementsToInsert = {15, 24, 2, 5, 42, 36, 15, 7, 4, 7, 11, 18};

        for (int i = 0; i < elementsToInsert.length; i++)
        {
            heap.add(elementsToInsert[i]);
        }

        System.out.println(heap);

        heap.add(4);
        System.out.println(heap);

        //loop and remove elements until the heap is empty
        while (!heap.isEmpty())
        {
            System.out.println(heap.remove());
        }
    }
}