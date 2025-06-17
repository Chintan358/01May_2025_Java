package collections;

import java.util.*;

public class C013_Hashmap {

    public static void main(String[] args) {


//        HashMap<Integer,String> map = new HashMap<>();

 //       LinkedHashMap<Integer,String> map = new LinkedHashMap<>();

        TreeMap<Integer,String> map = new TreeMap<>();

        map.put(10,"Java");
        map.put(2,"Python");
        map.put(30,"Android");
        map.put(4,"Php");

    //map.put(10,"dgfffg");

//        System.out.println(map.get(10));
//        System.out.println(map);

//        Set s = map.entrySet();
////
//        Iterator itr = s.iterator();
//        while(itr.hasNext())
//        {
//            System.out.println(itr.next());
//        }



        for(Map.Entry<Integer,String> m : map.entrySet())
        {
            System.out.println(m.getKey() +" | "+m.getValue());
        }


    }

}
