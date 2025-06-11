package exception;

public class ExceptionDemo {
    public static void main(String[] args) {


        System.out.println("program started...");


        try {
            int a = 10;
            int b = a/0;
            System.out.println(b);

//            int a[] = new int[5];
//            a[6] = 50;
        }
//        catch (ArithmeticException e)
//        {
//            e.printStackTrace();
//        }
//        catch(ArrayIndexOutOfBoundsException e)
//        {
//            e.printStackTrace();
//        }
        catch(Exception e)
        {
            e.printStackTrace();
        }

        System.out.println("Program ended...");


    }
}
