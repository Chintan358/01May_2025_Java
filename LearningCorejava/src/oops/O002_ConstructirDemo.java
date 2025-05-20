package oops;

class Student
{
    Student()
    {
        System.out.println("const calling...");
    }

    Student(int id)
    {
        System.out.println("id : "+id);
    }

    Student(String name)
    {
        System.out.println("name : "+name);
    }

    int id;
    String name;

    Student(int id, String name)
    {
        this.id = id;
        this.name = name;
    }

    public void display()
    {
        System.out.println(id+" "+name);
    }
}

public class O002_ConstructirDemo {
    public static void main(String[] args) {


//        Student st = new Student();
//
//        Student st1 = new Student(10);
//
//        Student st2 = new Student("Tops");

        Student st = new Student(10,"tops");
        st.display();

        Student st1  =new Student(20,"Kanha");
        st1.display();



    }
}
