package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class C006_TreeSet {
    public static void main(String[] args) {

        //only genriac data allowd

        TreeSet<String> set = new TreeSet<>();
        set.add("Java");
        set.add("Android");
        set.add("Oracle");
        set.add("React");
        set.add("Node");
        //set.add(11); -- Not possible


        //Iterator<String> itr = set.iterator();
        Iterator<String> itr = set.descendingIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
}
