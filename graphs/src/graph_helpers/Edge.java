package graph_helpers;

public class Edge<V, E>
{
    private V first;
    private V second;
    private E data;
    private int weight;

    public Edge(V first, V second, E data, int weight)
    {
        this.first = first;
        this.second = second;
        this.data = data;
        this.weight = weight;
    }

    public V getFirst()
    {
        return first;
    }

    public void setFirst(V first)
    {
        this.first = first;
    }

    public V getSecond()
    {
        return second;
    }

    public void setSecond(V second)
    {
        this.second = second;
    }

    public E getData()
    {
        return data;
    }

    public void setData(E data)
    {
        this.data = data;
    }

    public int getWeight()
    {
        return weight;
    }

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
        return "Edge{" +
                "first=" + first +
                ", second=" + second +
                ", data=" + data +
                ", weight=" + weight +
                '}';
    }
}
