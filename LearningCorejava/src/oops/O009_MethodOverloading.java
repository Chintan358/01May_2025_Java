package oops;

class Calc1
{
    public void add(int a, int b)
    {
        int c  =a+b;
        System.out.println("1 Result is : "+c);
    }

    public void add(int a, int b, int c)
    {
        int r = a+b+c;
        System.out.println("2 cResult is : "+r);
    }
    public void add(double a, int b)
    {
        double c  =a+b;
        System.out.println("3 Result is : "+c);
    }

}

public class O009_MethodOverloading {
    public static void main(String[] args) {

        Calc1 c = new Calc1();
        c.add(10,30);
        c.add(10,20,30);
        c.add(10.45,20);

    }


}
