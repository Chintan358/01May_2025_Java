package oops;

import java.util.Arrays;

class Calc
{
    public void getCalc()
    {
        System.out.println("Calc is working...");
    }

    public void square(int number)
    {
        int r = number * number;
        System.out.println("Square is : "+r);
    }

    public void add(int a, int b)
    {
        int add  =a+b;
        System.out.println("Addition is : "+add);
    }

    public String getMessage()
    {
        return "Hello java";
    }

    public int cube(int number)
    {
        int cube = number*number*number;
        return cube;
    }

    public void addArray(int a[])
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum +=a[i];
        }
        System.out.println("sum is : "+sum);
    }

    public int[] revArray(int a[])
    {
        int b[] = new int[a.length];
        int count = 0;
        for (int i = a.length-1; i >=0; i--) {
                b[count] = a[i];
                count++;
        }

        return b;
    }

    public void varargs(int...a)
    {
        System.out.println(a.length);
    }

}

public class O004_MethodManipulation {
    public static void main(String[] args) {

        Calc c = new Calc();
        c.getCalc();

        c.square(25);

        c.add(10,20);

        String msg = c.getMessage();
        System.out.println(msg);

        int cube = c.cube(5);
        System.out.println(cube);

        System.out.println(c.cube(50));

        int i[] = {10,20,30,40,50,60,70};
        c.addArray(i);

        int k[] =   c.revArray(i);
        System.out.println(Arrays.toString(k));


        c.varargs(10,20,30,40,50,60);
    }
}
