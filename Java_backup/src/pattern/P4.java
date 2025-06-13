package pattern;

public class P4 {

    public static void main(String[] args) {

//        *
//        **
//        ***
//        ****
//        *****
//
//        int lines = 5;
//        int starCount = 1;
//        for(int i=1;i<=lines;i++)
//        {
//            for(int j=1;j<=starCount;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//            starCount++;
//        }


//        *****
//        ****
//        ***
//        **
//        *


//        int lines = 5;
//        int starCount = lines;
//        for(int i=1;i<=lines;i++)
//        {
//            for(int j=1;j<=starCount;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//            starCount--;
//        }


//            *
//           **
//          ***
//         ****
//        *****



//        int lines = 5;
//        int starCount = 1;
//        int spaceCount = lines-1;
//        for(int i=1;i<=lines;i++)
//        {
//
//            for(int k=1;k<=spaceCount;k++)
//            {
//                System.out.print(" ");
//            }
//
//
//            for(int j=1;j<=starCount;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//            starCount++;
//            spaceCount--;
//        }

//        *****
//         ****
//          ***
//           **
//            *

//        int lines = 5;
//        int starCount = lines;
//        int spaceCount = 0;
//        for(int i=1;i<=lines;i++)
//        {
//
//            for(int k=1;k<=spaceCount;k++)
//            {
//                System.out.print(" ");
//            }
//
//
//            for(int j=1;j<=starCount;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//            starCount--;
//            spaceCount++;
//        }

//           *
//          * *
//         * * *
//        * * * *


//        int lines = 5;
//        int starCount = 1;
//        int spaceCount = lines-1;
//        for(int i=1;i<=lines;i++)
//        {
//
//            for(int k=1;k<=spaceCount;k++)
//            {
//                System.out.print(" ");
//            }
//
//
//            for(int j=1;j<=starCount;j++)
//            {
//                System.out.print("* ");
//            }
//            System.out.println();
//            starCount++;
//            spaceCount--;
//        }


//               *
//              ***
//             *****
//            *******
//           *********

//        int lines = 5;
//        int starCount = 1;
//        int spaceCount = lines-1;
//        for(int i=1;i<=lines;i++)
//        {
//
//            for(int k=1;k<=spaceCount;k++)
//            {
//                System.out.print(" ");
//            }
//
//
//            for(int j=1;j<=starCount;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//            starCount+=2;
//            spaceCount--;
//        }



//             *
//            ***
//           *****
//            ***
//             *

//        int lines = 5;
//        int starCount = 1;
//        int spaceCount = lines-1;
//        int mid = (lines/2)+1;
//        for(int i=1;i<=lines;i++)
//        {
//            for(int k=1;k<=spaceCount;k++)
//            {
//                System.out.print(" ");
//            }
//
//            for(int j=1;j<=starCount;j++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//            if(i<mid)
//            {
//                starCount+=2;
//                spaceCount--;
//            }
//            else {
//                starCount-=2;
//                spaceCount++;
//            }
//        }
//    }


//            *
//           * *
//          *   *
//           * *
//            *

//
//        int lines = 5;
//        int starCount = 1;
//        int spaceCount = lines-1;
//        int mid = (lines/2)+1;
//        for(int i=1;i<=lines;i++)
//        {
//            for(int k=1;k<=spaceCount;k++)
//            {
//                System.out.print(" ");
//            }
//
//            for(int j=1;j<=starCount;j++)
//            {
//                if(j==1 || j==starCount)
//                {
//                    System.out.print("*");
//                }
//                else {
//                    System.out.print(" ");
//                }
//
//            }
//
//            System.out.println();
//            if(i<mid)
//            {
//                starCount+=2;
//                spaceCount--;
//            }
//            else {
//                starCount-=2;
//                spaceCount++;
//            }
//        }


//        int lines= 7;
//        for(int i=lines;i>=1;i--)
//        {
//            for(int j=i;j<=lines;j++)
//            {
//                System.out.print(j);
//            }
//            System.out.println();
//        }


        int lines = 5;
        int starCount = 1;
        for(int i=1;i<=lines;i++)
        {
            for(int j=1;j<=starCount;j++)
            {
//               if(i%2==j%2)
//               {
//                   System.out.print("0");
//               }
//               else {
//                   System.out.print("1");
//               }
                System.out.print((i+j)%2);
            }
            System.out.println();
            starCount++;
        }


   }
    

}
