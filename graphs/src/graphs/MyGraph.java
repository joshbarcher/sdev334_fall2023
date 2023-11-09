package graphs;

import adts.IGraph;
import graph_helpers.Edge;

import java.util.*;

/**
 * This is an undirected, weighted graph!
 *
 * @param <V>
 * @param <E>
 */
public class MyGraph<V, E> implements IGraph<V, E>
{
    //adjacency lists
    private Map<V, LinkedList<Edge<V, E>>> lists;

    public MyGraph()
    {
        lists = new HashMap<>();
    }

    @Override
    public boolean addVertex(V vertex)
    {
        //is the vertex already in the graph?
        if (containsVertex(vertex))
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
        if (first.equals(second) ||
            !containsVertex(first) || !containsVertex(second) ||
            containsEdge(first, second))
        {
            return false; //duplicate edge or one of the vertices is missing!
        }

        //add edge to both adjacency lists
        Edge<V, E> edge = new Edge<>(first, second, data, weight);
        lists.get(first).add(edge);
        lists.get(second).add(edge);

        return true;
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
        return lists.containsKey(vertex);
    }

    @Override
    public boolean containsEdge(V first, V second)
    {
        //make sure the vertices exist
        if (!containsVertex(first) || !containsVertex(second))
        {
            return false;
        }

        //look up the edge in one of the adjacency lists
        LinkedList<Edge<V, E>> adjacents = lists.get(first);
        Edge<V, E> lookUp = new Edge<>(first, second, null, 0);

        return adjacents.contains(lookUp);
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

    @Override
    public List<V> dfs(V source)
    {
        Set<V> visit = new HashSet<>();
        List<V> traversal = new ArrayList<>();

        //begin the traversal
        dfsRecursive(source, visit, traversal);

        return traversal;
    }

    private void dfsRecursive(V current, Set<V> visited, List<V> traversal)
    {
        if (!visited.contains(current))
        {
            //visit this vertex
            visited.add(current);
            traversal.add(current);

            //go to neighbor vertices
            List<Edge<V, E>> adjacents = lists.get(current);
            for (int i = 0; i < adjacents.size(); i++)
            {
                Edge<V, E> edge = adjacents.get(i);
                V other = edge.getFirst().equals(current) ? edge.getSecond() : edge.getFirst();
                dfsRecursive(other, visited, traversal);
            }
        }
    }

    @Override
    public List<V> bfs(V source)
    {
        return null;
    }
}
