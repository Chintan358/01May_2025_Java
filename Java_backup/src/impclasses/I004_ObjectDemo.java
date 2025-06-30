package impclasses;

class Demo
{
    @Override
    public String toString() {
        return "Hello";
    }
}

public class I004_ObjectDemo {

    public static void main(String[] args) {

        Demo d = new Demo();
        System.out.println(d.getClass());
        System.out.println(d);

    }
}
