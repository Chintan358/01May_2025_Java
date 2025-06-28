package oops;

public class O007_Encaptulation {
    public static void main(String[] args) {


        Emp e  =new Emp();

        e.setId(10);
        e.setName("test");

        System.out.println(e.getId()+" "+e.getName());
    }
}
