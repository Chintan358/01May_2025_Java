package collections;

import java.util.LinkedList;

public class C007_LinkedList {
    public static void main(String[] args) {


        LinkedList<String> list = new LinkedList<>();
        list.add("Python");
        list.add("Java");
        list.addFirst("abc");
        list.addLast("xyz");
        list.add(2,"pqr");


        for(String s : list)
        {
            System.out.println(s);
        }

    }
}
