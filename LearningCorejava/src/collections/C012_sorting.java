package collections;

import java.util.ArrayList;
import java.util.Collections;

public class C012_sorting {
    public static void main(String[] args) {


        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(12);
        al.add(30);
        al.add(40);
        al.add(5);
        al.add(2);

        Collections.sort(al);

        for(Integer i : al)
        {
            System.out.println(i);
        }


    }
}
