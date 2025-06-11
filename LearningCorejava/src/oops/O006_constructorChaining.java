package oops;

class P
{
    P()
    {
        System.out.println("Class  P constor calling");
    }
}

class Q extends  P
{
    Q()
    {
        super();
        System.out.println("Class Q constructor calling");
    }

    Q(String name)
    {
        this();
        System.out.println("my name is : "+name);
    }
}

class R extends Q
{
    R()
    {
        super("Kanha");
        System.out.println("class R const calling...");
    }
}
public class O006_constructorChaining {
    public static void main(String[] args) {

        R r = new R();

    }
}
