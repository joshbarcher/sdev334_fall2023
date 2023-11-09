package test;

import graphs.MyGraph;

import java.util.List;

public class MyGraphTests
{
    public static void main(String[] args)
    {
        MyGraph<String, String> graph = new MyGraph<>();

        //add a few vertices
        graph.addVertex("a");
        graph.addVertex("b");
        graph.addVertex("c");
        graph.addVertex("d");
        graph.addVertex("e");
        graph.addVertex("f");
        graph.addVertex("g");
        graph.addVertex("h");
        graph.addVertex("i");

        System.out.println(graph.containsVertex("b"));
        System.out.println(graph.containsVertex("e"));

        //add a few edges
        graph.addEdge("a", "b", "", 12);
        graph.addEdge("b", "c", "", 3);
        graph.addEdge("b", "d", "", 7);
        graph.addEdge("c", "e", "", 1);
        graph.addEdge("e", "d", "", 42);
        graph.addEdge("d", "h", "", 12);
        graph.addEdge("h", "g", "", 11);
        graph.addEdge("g", "f", "", 4);
        graph.addEdge("e", "i", "", -2);

        System.out.println(graph.containsEdge("a", "b"));
        System.out.println(graph.containsEdge("d", "b"));

        List<String> dfs = graph.dfs("a");
        System.out.println(dfs);
    }
}
