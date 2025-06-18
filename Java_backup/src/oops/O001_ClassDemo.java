package oops;


class Pen
{
    //data memebr
    static int price = 10;
    String color = "Red";
    String company = "Cello";

    public void toWrite()
    {
        System.out.println(price+" "+color+" "+company);
    }

    public static void disp()
    {
        System.out.println("running display");
    }

}

public class O001_ClassDemo {

    public static void main(String[] args) {

            Pen.price = 5000;

            Pen p1 = new Pen();
            p1.color="black";
            p1.toWrite();

            Pen p2 = new Pen();

            p2.toWrite();

            Pen p3 = new Pen();
            p3.toWrite();


            Pen.disp();

    }

}
