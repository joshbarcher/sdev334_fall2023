package queues;

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
        heap[size] = element;
        swim(size);
        size++;
    }

    private void swim(int size)
    {
        //TODO we need to write swim()
    }

    @Override
    public int remove()
    {
        return 0;
    }

    @Override
    public int peek()
    {
        return 0;
    }

    @Override
    public int size()
    {
        return 0;
    }

    @Override
    public boolean isEmpty()
    {
        return false;
    }

    @Override
    public void clear()
    {

    }
}
