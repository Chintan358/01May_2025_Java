package collections;

import java.util.ArrayList;

public class C003_NonGeneric {
    public static void main(String[] args) {


        ArrayList al = new ArrayList();
        al.add(10);
        al.add("abc");
        al.add(10.22);
        al.add('A');

        for(Object s : al)
        {
            System.out.println(s);
        }

    }
}
