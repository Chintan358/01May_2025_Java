package oops;

interface  I1
{
    public void disp();
}

interface  I2
{
    public static final int i = 20;
    public void disp();
}

class Base
{

}

class InterImpl extends Base implements  I1,I2
{
    @Override
    public void disp() {
        System.out.println("running disp");
    }
}

public class O012_InterfaceDemo {
    public static void main(String[] args) {

    }
}
