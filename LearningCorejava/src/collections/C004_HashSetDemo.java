package collections;

import java.util.HashSet;

public class C004_HashSetDemo {
    public static void main(String[] args) {

        //default size : 16
        //load factor : 0.75
        //new size : 12 ---> 32
        HashSet<Integer> set = new HashSet<>();
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
