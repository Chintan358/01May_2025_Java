package impclasses;

class Sample {
    public void disp() {

    }

 //   @Override
    public String toString() {
        return "Hello";
    }
}
public class I005_ObjectDemo {


    public static void main(String[] args) {

        Sample s1  =new Sample();
        System.out.println(s1);
        System.out.println(s1.getClass());

    }
}
