package thread;

class Calc
{
   synchronized public void table(int num)
   {
        for(int i=1;i<=10;i++)
        {
            System.out.println(Thread.currentThread().getName()+"_"+num*i);
        }
    }
}

class Th extends Thread
{
    Calc c = new Calc();
    @Override
    public void run() {
        c.table(5);
    }
}

public class MethodSync {
    public static void main(String[] args) {

        Th t1 = new Th();
        Th t2 = new Th();
        Th t3 = new Th();

        t1.start();
        t2.start();
        t3.start();

    }
}
