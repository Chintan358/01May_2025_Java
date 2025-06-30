package impclasses;

import java.util.Arrays;

public class I002_StringMethods {
    public static void main(String[] args) {


        String str = "This is myFirst String PRactical";

        System.out.println(str.length());
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.indexOf('S'));
        System.out.println(str.charAt(16));
        System.out.println(str.substring(5,9));
        System.out.println(str.replace('i','R'));
        System.out.println(str.startsWith("T"));
        System.out.println(str.endsWith("l"));


        String words[] =  str.split(" ");
        System.out.println(Arrays.toString(words));

        char ch[] = str.toCharArray();
        System.out.println(Arrays.toString(ch));

        byte b[] = str.getBytes();
        System.out.println(Arrays.toString(b));



        //practicals :

       // String str = "Hello Java Hello Tops";

        //Tops Hello Java Hello
        //spoT olleH avaJ olleH
        //olleH avaJ olleH spoT
        //Tops Java Hello Hello`





    }
}
