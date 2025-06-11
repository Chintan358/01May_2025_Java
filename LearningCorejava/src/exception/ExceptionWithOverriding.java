package exception;

class Demo
{
    public void display() throws  Exception
    {

    }
}

public class ExceptionWithOverriding extends  Demo
{
    @Override
    public void display()  throws  ArithmeticException
    {
     //   super.display();
    }
}
