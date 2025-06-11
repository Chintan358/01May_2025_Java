package oops;

class Sample1
{
    public void show()
    {
        System.out.println("Sample1 show method calling");
    }
}

class Sample2 extends  Sample1
{
    @Override
    public void show() {
        System.out.println("Sample 2 show method calling");
        super.show();
    }
}
public class O010_MethodOverriding {
    public static void main(String[] args) {

        Sample2 sa = new Sample2();
        sa.show();

    }
}
