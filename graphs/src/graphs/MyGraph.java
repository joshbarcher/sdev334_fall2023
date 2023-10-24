package graphs;

import adts.IGraph;
import graph_helpers.Edge;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class MyGraph<V, E> implements IGraph<V, E>
{
    //adjacency lists
    private Map<V, LinkedList<V>> lists;

    public MyGraph()
    {
        lists = new HashMap<>();
    }

    @Override
    public boolean addVertex(V vertex)
    {
        //is the vertex already in the graph?
        if (lists.containsKey(vertex))
        {
            return false; //duplicate vertex!
        }

        lists.put(vertex, new LinkedList<>());
        return true;
    }

    @Override
    public boolean addEdge(V first, V second, E data,
                           int weight)
    {
        return false;
    }

    @Override
    public boolean removeVertex(V vertex)
    {
        return false;
    }

    @Override
    public boolean removeEdge(V first, V second)
    {
        return false;
    }

    @Override
    public boolean containsVertex(V vertex)
    {
        return false;
    }

    @Override
    public boolean containsEdge(V first, V second)
    {
        return false;
    }

    @Override
    public List<V> getAdjacentVertices(V source)
    {
        return null;
    }

    @Override
    public List<V> getVertexSet()
    {
        return null;
    }

    @Override
    public List<Edge<V, E>> getEdgeSet()
    {
        return null;
    }

    @Override
    public int vertexSize()
    {
        return 0;
    }

    @Override
    public int edgeSize()
    {
        return 0;
    }

    @Override
    public boolean setVertex(V oldValue, V newValue)
    {
        return false;
    }
}
