package collections;

import java.util.LinkedHashSet;

public class C005_LinkedHashset {
    public static void main(String[] args) {


        LinkedHashSet<Integer> set= new LinkedHashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(50);
        set.add(null);

        for(Integer i : set)
        {
            System.out.println(i);
        }


    }
}
