package oops;

class X
{
    public void disp()
    {
        System.out.println("running disp");
    }
}

class Y extends  X
{
    public void run()
    {
        System.out.println("Runing run");
    }
}
public class O007_Casting {
    public static void main(String[] args) {


//        X x  =new X();
//        x.disp();
//
//        Y y = new Y();
//        y.run();

        //upcasting
        //X x  = new Y();

        //downcating
        if(new X() instanceof  Y)
        {
            Y y = (Y)new X();
        }
        else {
            System.out.println("Not possible");
        }


        System.out.println(new X() instanceof Y);
        System.out.println(new Y() instanceof X);


    }
}
