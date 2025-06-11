package array;

public class ArrayDemo {
    public static void main(String[] args) {

        //declaration
        //int[] a = new int[6];

        //initalization
        //a[0] = 10;
       // a[1] = 20;
       // a[2] = 30;

       // a[6] =45;  exception

       // for (int i = 0; i <a.length; i++) {
       //     System.out.println(a[i]);
       // }


        int a[] = {10,20,30,40,50,60};

        for (int i = 0; i <a.length; i++) {
            System.out.println(a[i]);
        }

        String[] subjects = {"Java","Php","Python","Node"};
        for (int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i]);
        }

        char[] ch = {'a','b','c'};
        for (int i = 0; i < ch.length; i++) {
            System.out.println(ch[i]);
        }

    }
}
