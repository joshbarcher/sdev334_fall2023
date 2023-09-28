package queues;

public interface IPriorityQueue
{
    //primary ADT methods
    void add(int element);
    int remove();
    int peek();

    //nice to haves...
    int size();
    boolean isEmpty();
    void clear();
}
