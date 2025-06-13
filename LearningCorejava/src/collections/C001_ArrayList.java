package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class C001_ArrayList {
    public static void main(String[] args) {

        //defualt size : 10
        //newsize = oldsize*(3/2) + 1 = 16
        //allow - Duplication
        //allow - null value
        //preserving insertion order
        ArrayList<String> al = new ArrayList<>();
        al.add("Java");
        al.add("PhP");
        al.add("Android");
        al.add("Ios");
        al.add("Java");
     //   al.add(null);

        //al.add(1,"SQL");
        //al.set(1,"SQL");
        //System.out.println(al.get(1));
        //al.remove(1);
        //System.out.println(al.size());
        //System.out.println(al.contains("Java"));

//        for(String s : al)
//        {
//            System.out.println(s);
//        }

       // Iterator<String> itr = al.iterator();
        ListIterator<String> itr = al.listIterator();
        while(itr.hasNext())
        {
            String data = itr.next();
           if(data.equals("Java"))
           {
               itr.remove();
           }
           else {
               System.out.println(data);
           }
        }

        System.out.println("***********************");


//        while(itr.hasPrevious())
//        {
//            System.out.println(itr.previous());
//        }

    }
}
