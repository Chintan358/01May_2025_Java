package oops;

class Student
{

//    Student()
//    {
//        System.out.println("const calling...");
//    }
//
//    Student(int i)
//    {
//        System.out.println(i);
//    }
//
//    Student(String name)
//    {
//        System.out.println(name);
//    }

    int id;
    String name;
    String email;

    Student(int id, String name, String email)
    {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    public void display()
    {
        System.out.println(id+" "+name+" "+email);
    }
}

public class O002_construcotrDemo {

    public static void main(String[] args) {


//        Student st = new Student(10);
//        Student st1 = new Student("Bansi");


        Student st = new Student(10,"harekrishna","hk@gmail.com");
        st.display();

        Student st1 = new Student(20,"bansi","bansi@gmail.com");
        st1.display();

    }

}
