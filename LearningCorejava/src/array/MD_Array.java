package array;

public class MD_Array  {
    public static void main(String[] args) {


//        int a[][] = new int[5][3];
//
//        a[0][0] = 10;
//        a[0][1] = 20;
//        a[0][2] = 30;
//
//        a[1][0] = 10;
//        a[1][1] = 20;
//        a[1][2] = 30;
//
//
//        for(int i = 0;i<5;i++)
//        {
//            for(int j=0;j<3;j++)
//            {
//                System.out.println(a[i][j]);
//            }
//        }


        int a[][] = {{10,20,30},{40,50,60},{70,80,90}};

        for(int i = 0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

    }
}
