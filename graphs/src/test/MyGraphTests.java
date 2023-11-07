package test;

import graphs.MyGraph;

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

        System.out.println(graph.containsVertex("b"));
        System.out.println(graph.containsVertex("e"));

        //add a few edges
        graph.addEdge("a", "b", "hello", 12);
        graph.addEdge("b", "c", "world", 3);
        graph.addEdge("d", "a", "hi", 7);

        System.out.println(graph.containsEdge("a", "b"));
        System.out.println(graph.containsEdge("d", "b"));
    }
}
