package collections;

import java.util.ArrayList;

public class C010_StudentCollection {
    public static void main(String[] args) {


        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student(10,"Kanha","kanha@gmail.com"));
        al.add(new Student(20,"Harekrishna","kh@gmail.com"));
        al.add(new Student(30,"bansi"));

        for(Student s : al)
        {
           // s.display();
            System.out.println(s);
        }

    }
}
