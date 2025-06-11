package impclasses;

public class I006_WrapperDemo {
    public static void main(String[] args) {

//        byte - Byte
//        short  - Short
//        int - Integer
//        long - Long
//        float - Float
//        double - Double
//        char - Character
//        boolean - Boolean


        //int i = 0;

        //boxing
        // Integer a = new Integer(i);
        //auto boxing
        // Integer b = i;

        //Integer k = 10;

        //unboxing
        //int x = k.intValue();
        //auto unboxing
        //int y = k;


        int j = 454564;
        Integer k = j;
        int length =  k.toString().length();
        System.out.println(length);


    }
}
