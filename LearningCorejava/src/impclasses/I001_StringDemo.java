package impclasses;

public class I001_StringDemo {
    public static void main(String[] args) {

        //string literal
//        String str = "Hello";
//
//        //string object - using new keyword
//        String str1 = new String("Hello");
//
//        String s3 =  str.concat("Java");
//
//        System.out.println(str);
//        System.out.println(str1);
//        System.out.println(s3);


        String s1 = "java";
        String s2 = "Python";
        String s3 = "java";


        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);


        System.out.println("*******************");

        String str1 = new String("java");
        String str2 = new String("Python");
        String str3 = new String("java");


        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1==str3);

    }
}
