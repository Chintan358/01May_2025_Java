package basic;




public class Datatypes {
    public static void main(String[] args) {

//        byte      0       1 byte      2^7 - 1 to -2^7   : 127 to -128
//        short     0       2 byte      2^15 -1 to -2^15
//        int       0       4 byte
//        long      0       8 byte

//        float     0.0     4 byte
//        double    0.0     8 byte

//        char              1 byte
//        boolean   false   1 bit

//        String str = "Hello"; - not a datatype

//        byte b = -128;
//        short s = 12125;
//        int i = 64545454;
//        long l = 5454564654l;
//
//        float f = 4545.5654554f;
//        double d = 54545.5456656;

//        System.out.println(f);
//        System.out.println(d);

//        char c = 'A';
//        boolean bool = true;


//        int a = 'D';
//        System.out.println(a);
//
//        char c = 69;
//        System.out.println(c);

        //widning - implicite
        int a  =10;
        long l =a;

        //nerrowing - explicite
        long b = 45465;
        int c = (int) b;


    }
}
