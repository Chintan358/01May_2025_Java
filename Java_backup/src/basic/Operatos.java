package basic;

import com.sun.security.jgss.GSSUtil;

public class Operatos {
    public static void main(String[] args) {

        //arithmatic   +,-,*,/,%
        //logical      &&, ||, !
        //relational   <,>,<=,>=,==,!=
        //assignment   =, +=, -=...
        //unary        ++,--
        //turnary      condition ? true:false


        //Arithmatic :
//        int a = 10;
//        int b = 20;
//
//        System.out.println(a+b);
//        System.out.println(a+"Hello");
//        System.out.println(a+b+"hello");
//        System.out.println("Hello"+a+b);

        //logical
//        System.out.println(true && true);
//        System.out.println(true && false);
//        System.out.println(false && true);
//        System.out.println(false && false);
//
//
//        System.out.println(true || true);
//        System.out.println(true || false);
//        System.out.println(false || true);
//        System.out.println(false || false);
//
//        System.out.println(!true);

//        unary
//
//            int a = 10;
//            int b = ++a + a++ - a-- + --a;
//
//        System.out.println(a);  //10
//        System.out.println(b);  //19

//        turnary

//        condtion ? true : false

        int a = 10;
        int b = 20;

       String rel =   a>b ? "A is greater" : "B is greater";
        System.out.println(rel);

    }
}
