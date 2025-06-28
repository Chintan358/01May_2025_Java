package oops;

class Calc1
{
    public void add(int a, int b)
    {
        int r  =a+b;
        System.out.println("Result 1 : "+r);
    }

    public void add(int a, int b, int c)
    {
        int r = a+b+c;
        System.out.println("Result 2 : "+r);
    }

    public void add(double a, int b)
    {
        double r = a+b;
        System.out.println("Result 3 : "+r);
    }


}
public class O008_MethodOverlaoding {

    public static void main(String[] args) {


        Calc1 c1 = new Calc1();
        c1.add(10,20);
        c1.add(10,20,30);
        c1.add(10.45,20);

    }

    public static void main(String args) {

    }
}
