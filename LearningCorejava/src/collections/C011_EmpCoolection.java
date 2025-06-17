package collections;

import java.util.ArrayList;
import java.util.Collections;

public class C011_EmpCoolection {

    public static void main(String[] args) {


        ArrayList<Emp> al = new ArrayList<>();
        al.add(new Emp(10,"Kanha","kanha@gmail.com"));
        al.add(new Emp(2,"Bansi","bansi@gmial.com"));
        al.add(new Emp(3,"HArekrishan","hk@gmial.com"));


        Collections.sort(al);


        for(Emp e : al)
        {
            System.out.println(e);
        }



    }

}
