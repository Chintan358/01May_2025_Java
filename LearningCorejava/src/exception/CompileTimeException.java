package exception;

class Run
{
    public void disp() throws ClassNotFoundException {

            Class.forName("Demo");

    }
}

public class CompileTimeException {

    public static void main(String[] args) {

//        try {
//            Class.forName("Demo");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }

        Run r  =new Run();
        try {
            r.disp();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


//                try {
//            Class.forName("Demo");
//        } catch (ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//        finally{
//
//                }



    }

}
