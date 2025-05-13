package array;

public class ArrayOprations {
    public static void main(String[] args) {

//        int[] a = {10,20,300,1400,500,60,70,0,-1};
//
//        int sum =0;
//        for (int i = 0; i <a.length; i++) {
//            sum += a[i];
//        }
//
//        System.out.println("sum : "+sum);
//        System.out.println("Avg : "+(sum/a.length));
//
//        int max = a[0]; //500
//        int min = a[0];
//        for (int i = 0; i < a.length; i++) {
//
//            if(a[i]>max)
//            {
//                max= a[i];
//            }
//
//            if(a[i]<min)
//            {
//                min = a[i];
//            }
//        }
//
//        System.out.println("Max : "+max);
//        System.out.println("Min : "+min);


        int[] a = {1,2,4,9,6,3,9,8,7,0};

        int max = a[0];  //2  8
        int smax = a[0]; //1  2

        for (int i = 0; i < a.length; i++) {

            if(a[i]>max)
            {
                smax = max;
                max = a[i];
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
