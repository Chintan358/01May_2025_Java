package oops;

class P
{
    P()
    {
        System.out.println("P const. calling");
    }
}

class Q extends P
{
    Q()
    {
        super();
        System.out.println("Q const calling");
    }

    Q(int a)
    {
        this();
        System.out.println("a : "+a);
    }
}

class R extends Q
{
    R()
    {
        super(10);
        System.out.println("R const calling");
    }
}
public class O006_ConstructorChaining {
    public static void main(String[] args) {

        R r = new R();


    }
}
