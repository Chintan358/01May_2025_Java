package oops;

class X
{
     public void disp(int a)
    {
        System.out.println("Running Class X display");
    }
}

class Y extends  X
{
    @Override
    public void disp(int d) {
        System.out.println("Runing class Y disp");
    }


}

public class O009_MethodOveriding {
    public static void main(String[] args) {

        Y y = new Y();
        y.disp(10);

//        final int a = 20;
//        a = 50;
//        System.out.println(a);
    }
}
