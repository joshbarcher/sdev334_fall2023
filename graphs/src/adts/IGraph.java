package adts;

import graph_helpers.Edge;

import java.util.List;

/**
 * This represents a weighted, undirected graph.
 *
 * @author Josh Archer
 * @version 1.0
 * @param <V> the type of data in a vertex
 */
public interface IGraph<V, E>
{
    //put vertices and edges in the graph
    boolean addVertex(V vertex);
    boolean addEdge(V first, V second, E data, int weight);

    //removing things
    boolean removeVertex(V vertex);
    boolean removeEdge(V first, V second);

    //finding things
    boolean containsVertex(V vertex);
    boolean containsEdge(V first, V second);

    //graph interactions
    List<V> getAdjacentVertices(V source);

    //accessing elements
    List<V> getVertexSet();
    List<Edge<V, E>> getEdgeSet();

    //counting things
    int vertexSize();
    int edgeSize();

    //updating elements
    boolean setVertex(V oldValue, V newValue);

    //traversals
    List<V> dfs(V source);
    List<V> bfs(V source);
}
