package structures;

public class DisjointSets
{
    private int[] sets;

    public DisjointSets(int numElements)
    {
        sets = new int[numElements];
        for (int i = 0; i < sets.length; i++)
        {
            sets[i] = -1;
        }
    }

    public boolean union(int first, int second)
    {
        int firstRoot = find(first);
        int secondRoot = find(second);

        if (firstRoot == secondRoot) //are these already in the same set
        {
            return false;
        }
        else if (sets[firstRoot] < sets[secondRoot])
        {
            sets[secondRoot] = firstRoot;
        }
        else if (sets[firstRoot] > sets[secondRoot])
        {
            sets[firstRoot] = secondRoot;
        }
        else //same height, pick a new root arbitrarily and increase tree height
        {
            sets[secondRoot] = firstRoot;
            sets[firstRoot]--; //this will increase the magnitude of the height
        }

        return true;
    }

    public int find(int search)
    {
        //is the input a root?
        if(sets[search] < 0)
        {
            return search;
        }
        return find(sets[search]); //call the method again on the parent of this element
    }

    public boolean sameSet(int first, int second)
    {
        return find(first) == find(second);
    }
}
