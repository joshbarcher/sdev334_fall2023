package experiment;

public class Foo
{
    private static int methodCalls = 0;

    public static void main(String[] args)
    {
        foo();
    }

    public static void foo()
    {
        methodCalls++;
        System.out.println(methodCalls);
        foo();
    }
}
