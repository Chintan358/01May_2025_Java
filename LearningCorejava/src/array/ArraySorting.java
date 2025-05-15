package array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {


        int a[] = {2,5,6,8,4,3,1,2,0};

        for(int i=1;i<=a.length;i++)
        {
            for(int j=1;j<=a.length-i;j++)
            {
                if(a[j-1]<a[j])
                {
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]  =temp;
                }
            }
        }

        System.out.println(Arrays.toString(a));




    }
}
