package exception;

class Demo
{
    public void disp() throws ClassNotFoundException {

            Class.forName("Demo");

    }
}
public class CompileException {
    public static void main(String[] args) {

//
//        try {
//            Class.forName("Demo");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        Demo d = new Demo();
        try {
            d.disp();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
