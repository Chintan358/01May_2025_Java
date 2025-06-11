package oops;

class A
{
    int id = 10;
    public void display()
    {
        System.out.println("running display of class A");
    }
}

class B extends A
{
    int id = 100;
    public void run()
    {
        int id = 500;
        System.out.println("id : "+id);
        System.out.println("id : "+this.id);
        System.out.println("id : "+super.id);
        System.out.println("running run method..of class B");
    }
}

//class C extends  B{
//    multilevel
//}

//class C extends  A, B{
//    multiple - not supported in java
//}

//class C extends  A{
//    hirchicle
//}



public class O005_InheritanceDemo {
    public static void main(String[] args) {

        B b = new B();
        //b.display();
        b.run();

    }
}
