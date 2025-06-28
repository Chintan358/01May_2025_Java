package oops;

abstract class Abs
{
    abstract public void display();

    public void run()
    {
        System.out.println("Run....");
    }
}

class AbsImpl extends  Abs
{

    @Override
    public void display() {
        System.out.println("calling display");
    }
}

public class O010_AbstractClass {
    public static void main(String[] args) {


        //Abs abs = new Abs();

        AbsImpl abs = new AbsImpl();
        abs.display();
    }
}
