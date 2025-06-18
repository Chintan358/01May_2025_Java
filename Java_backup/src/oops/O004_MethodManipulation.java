package oops;

import java.util.Arrays;

class Calc
{
        public void getMsg()
        {
            System.out.println("Message....");
        }

        public void square(int a)
        {
            System.out.println(a*a);
        }

        public void add(int a, int b)
        {
            System.out.println(a+b);
        }

        public String test()
        {
            return "teing msg";
        }

        public int cube(int a)
        {
            return a*a*a;
        }

        public  void addArray(int a[])
        {
            int sum = 0;
            for (int i = 0; i < a.length; i++) {
                sum+=a[i];
            }
            System.out.println(sum);
        }

        public int[] revArray(int a[])
        {
            int b[] = new int[a.length];
            int count = 0;
            for(int i=a.length-1;i>=0;i--)
            {
                b[count] = a[i];
                count++;
            }

            return b;
        }

        public void varargs(int...a)
        {
            System.out.println(Arrays.toString(a));
        }


}

public class O004_MethodManipulation {
    public static void main(String[] args) {


        Calc c = new Calc();
        c.getMsg();
        c.square(10);
        c.add(10,20);

        String s =  c.test();
        System.out.println(s);
        System.out.println(c.test());

        System.out.println(c.cube(12));


        int a[] = {10,20,30,40,50};
        c.addArray(a);

        System.out.println(Arrays.toString(c.revArray(a)));

        c.varargs(10,20,30,40,50,60,70,80);

    }
}
