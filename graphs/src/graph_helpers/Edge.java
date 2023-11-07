package graph_helpers;

import java.util.Objects;

public class Edge<V, E>
{
    private V first;
    private V second;
    private E data;
    private int weight;

    @Override
    public boolean equals(Object other)
    {
        //double check that this is a new object, not null, and an Edge object
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;

        //cast the param to an Edge
        Edge<?, ?> otherEdge = (Edge<?, ?>) other;

        //compare based on our fields
        return (first.equals(otherEdge.first) && second.equals(otherEdge.second)) ||
                (second.equals(otherEdge.first) && first.equals(otherEdge.second));
    }

    @Override
    public int hashCode()
    {
        return first.hashCode() * second.hashCode();
    }

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
