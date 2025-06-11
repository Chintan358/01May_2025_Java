package exception;

class Sample
{
    public void square(int a)
    {
        int sq = a*a;
        System.out.println(sq);
        a++;
        if(a<20)
        {
            square(a);
        }

    }
}

public class RecursionDemo {
    public static void main(String[] args) {


        Sample s = new Sample();
        s.square(5);



    }
}
