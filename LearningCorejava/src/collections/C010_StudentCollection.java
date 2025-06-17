package collections;

import java.util.ArrayList;
import java.util.Collections;

public class C010_StudentCollection {
    public static void main(String[] args) {


        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(10,"aanha","kanha@gmail.com"));
        al.add(new Student(2,"harekrishna","hk@gmail.com"));
        al.add(new Student(30,"bansi","test@gmail.com"));

        //Collections.sort(al,new SortById());
        Collections.sort(al,new SortByName());

        for(Student s : al)
        {
           // s.display();
            System.out.println(s);
        }

    }
}
