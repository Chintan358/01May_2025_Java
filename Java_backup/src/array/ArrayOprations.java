package array;

import java.util.Arrays;

public class ArrayOprations {
    public static void main(String[] args) {


//        int a[]= {1,5,6,8,9,45,1,0,56,10,56,41};
//        int b[] = new int[a.length];
//        System.arraycopy(a,2,b,5,4);
//        System.out.println(Arrays.toString(b));

//        int a[] = {10,20,30,40,50};
//        int b[] = {1,2,3,4,5};
//
//        int c[] = new int[a.length+b.length];
//
//        for (int i = 0; i < a.length; i++) {
//            c[i] = a[i];
//        }
//        for (int i = 0; i < b.length; i++) {
//            c[a.length+i] = b[i];
//        }
//        System.out.println(Arrays.toString(c));


//        int a[]= {1,5,6,8,9,45,1,0,56,10,56,41};
//
//        int sum = 0;
//        int max = a[0];
//        int min = a[0];
//        for (int i = 0; i < a.length; i++) {
//            sum+=a[i];
//
//            if(a[i]<min)
//            {
//                min = a[i];
//            }
//
//            if(a[i]>max)
//            {
//                max = a[i];
//            }
//        }

//        System.out.println("sum : "+sum);
//        System.out.println("Avg : "+(sum/a.length));
//        System.out.println("MAx : "+max);
//        System.out.println("min  : "+min);

        int a[] = {10,20,45,65,4,70,68,70,44,12};

        int max= a[0];
        int smax = a[0];
        for (int i = 0; i < a.length; i++) {

            if(a[i]>max)
            {
                smax = max;
                max =  a[i];
            }
            else if(a[i]>smax && a[i]!=max)
            {
                    smax = a[i];
            }
        }

        System.out.println("max : "+max);
        System.out.println("smax : "+smax);


    }
}
