package oops;

class Sample
{
    static int count  = 0;
    Sample()
    {
//        System.out.println("Construcotr calling");
       count++;
//        System.out.println(count);
    }
}

public class O003_StaticDemo {
    public static void main(String[] args) {

        Sample s1 = new Sample();
        Sample s2 = new Sample();
        Sample s3= new Sample();
        Sample s4 = new Sample();

        System.out.println(Sample.count);



    }
}
