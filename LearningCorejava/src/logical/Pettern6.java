package logical;

public class Pettern6 {
    public static void main(String[] args) {

//            *
//           * *
//          * * *
//           * *
//            *

//        int lines = 5;
//        for(int i=1;i<=lines;i++)
//        {
//            for(int k=1;k<=lines-i;k++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for(int i=lines-1;i>=1;i--)
//        {
//            for(int k=1;k<=lines-i;k++)
//            {
//                System.out.print(" ");
//            }
//            for(int j=1;j<=i;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }



        int lines = 15;
        int starCount  =1;
        int spacecount = lines -1;
        int mid = (lines/2)+1;
        for (int j = 1; j <=lines; j++) {
            for(int k=1;k<=spacecount;k++)
            {
                System.out.print(" ");
            }
            for (int i = 1; i <=starCount; i++) {
                System.out.print("* ");
            }
            System.out.println();
            if(j<mid) {
                starCount++;
                spacecount--;
            }
            else {
                starCount--;
                spacecount++;
            }
        }








    }
}
