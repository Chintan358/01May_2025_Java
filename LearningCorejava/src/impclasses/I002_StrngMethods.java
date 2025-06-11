package impclasses;

public class I002_StrngMethods {
    public static void main(String[] args) {


        String str = "Sun rises in East";

        System.out.println(str.length());
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.indexOf('i'));
        System.out.println(str.lastIndexOf('i'));
        System.out.println(str.charAt(10));
        System.out.println(str.substring(10));
        System.out.println(str.substring(10,15));
        System.out.println(str.replace('i','K'));
        System.out.println(str.startsWith("S"));
        System.out.println(str.endsWith("st"));
        System.out.println(str.trim());

<<<<<<< HEAD
     
=======

>>>>>>> 7903638b9c755a8784da33ced387e7493e7106a7
        String words[] =  str.split(" ");
        for (int i = 0; i < words.length; i++) {

            System.out.println(words[i]);
        }

        char ch[] = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

        byte b[] = str.getBytes();
        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }
}
