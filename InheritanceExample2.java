package classwork;
public class InheritanceExample2	{
    public static void main(String args[])    {
        SubClass sc = new SubClass();
        sc.doSomething();
        BaseClass bc = new SubClass();
        bc.doSomething();
    }
}