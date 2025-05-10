package logical;

public class Pettern3 {
    public static void main(String[] args) {

//        *****
//         ****
//          ***
//           **
//            *

        int lines = 5;
        for (int j = lines; j >=1; j--) {

            for(int k=0;k<=(lines-j);k++)
            {
                System.out.print(" ");
            }

            for (int i = 1; i <=j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

//        int lines = 5;
//        int starCount  =lines;
//        int spacecount = 0;
//        for (int j = 1; j <=lines; j++) {
//            for(int k=1;k<=spacecount;k++)
//            {
//                System.out.print(" ");
//            }
//            for (int i = 1; i <=starCount; i++) {
//                System.out.print("*");
//            }
//            System.out.println();
//            starCount--;
//            spacecount++;
//        }








    }
}
