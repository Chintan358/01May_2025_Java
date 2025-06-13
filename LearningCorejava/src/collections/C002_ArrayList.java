package collections;

import java.util.ArrayList;

public class C002_ArrayList {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();
        al.add("A");
        al.add("B");
        al.add("C");

        ArrayList<String> al1 = new ArrayList<>(al);
        al1.add("X");
        al1.add("Y");
        al1.add("Z");
        al1.addAll(al);
        al1.removeAll(al);

        for(String s : al1)
        {
            System.out.println(s);
        }




    }
}
