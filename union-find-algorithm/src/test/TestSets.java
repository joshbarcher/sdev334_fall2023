package test;

import structures.DisjointSets;

public class TestSets
{
    public static void main(String[] args)
    {
        DisjointSets disjointSets = new DisjointSets(10);

        //union together a few sets
        disjointSets.union(1, 2);
        disjointSets.union(4, 9);
        disjointSets.union(2, 3);
        disjointSets.union(2, 4);
        disjointSets.union(6, 7);

        //search for roots (these should be the same value)
        System.out.println(disjointSets.find(1));
        System.out.println(disjointSets.find(2));
        System.out.println(disjointSets.find(3));

        //identify similar sets
        System.out.println(disjointSets.sameSet(2, 9)); //true
        System.out.println(disjointSets.sameSet(6, 1)); //false
    }
}
