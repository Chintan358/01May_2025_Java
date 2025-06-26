package oops;

//base - parent - super
class A
{
    int id = 10;
    public void display()
    {
        System.out.println("Running class A display method");
    }
}

//derived - child - sub
class B extends A
{
    int id = 100;
    public void show()
    {
        int id = 200;
        System.out.println(id);
        System.out.println(this.id);
        System.out.println(super.id);
        System.out.println("Running class B show method");
    }
}

//multilevel
//class C extends  B{
//
//}

//hirarchical
//class C extends  A{
//
//}

//multiple - not suppoerted in java
//class C extends B,A
//{
//
//}

public class O005_InheritnceDemo {
    public static void main(String[] args) {

//        B b = new B();
//        b.show();
//        b.display();

        //upcasting
        //A a = new B();


        //donwcasting
        //B b = (B)new A();


        System.out.println(new B() instanceof A);
        System.out.println(new A() instanceof B);

    }
}
