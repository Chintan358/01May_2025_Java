package oops;

abstract class Abs {
    public abstract void display();

    public void test() {
        System.out.println("running test...");
    }
}
class AbsImpl extends Abs
{

    @Override
    public void display() {
        System.out.println("Absimpl calling");
    }
}

public class O011_AbstractClassDemo {
    public static void main(String[] args) {

      //  Abs a = new Abs();

        AbsImpl abs = new AbsImpl();
        abs.display();


    }
}
