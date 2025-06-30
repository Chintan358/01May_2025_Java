package basic;

class Demo
{
        public void display()
        {

        }
}

class Sample
{
    static Demo demo = new Demo();
}

public class Aggregation {
    public static void main(String[] args) {

       // Sample sample = new Sample();

        Sample.demo.display();
        System.out.println();
    }
}
