package pattern;

public class P2 {

//    *
//    **
//    ***
//    ****
//    *****

    public static void main(String[] args) {

//        for(int j=1;j<=5;j++)
//        {
//            for(int i=1;i<=j;i++)
//            {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        int stars = 1;
        for(int j=1;j<=5;j++)
        {
            for(int i=1;i<=stars;i++)
            {
                System.out.print("*");
            }
            System.out.println();
            stars++;
        }





    }


}
