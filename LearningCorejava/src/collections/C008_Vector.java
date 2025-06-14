package collections;

import java.util.Enumeration;
import java.util.Vector;

public class C008_Vector {
    public static void main(String[] args) {

        Vector<String> ve = new Vector<>();
        ve.addElement("A");
        ve.addElement("B");
        ve.addElement("C");
        ve.addElement("D");

        Enumeration<String> env = ve.elements();
        while(env.hasMoreElements())
        {
            System.out.println(env.nextElement());
        }





    }
}
