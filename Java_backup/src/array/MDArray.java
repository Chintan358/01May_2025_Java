package array;

public class MDArray {
    public static void main(String[] args) {

//        int a[][] = new int[3][5];
//
//        a[0][0] = 12;
//        a[0][1] = 30;
//        a[0][2] = 20;
//        a[0][3] = 20;
//        a[0][4] = 56;
//        a[1][0] = 12;
//        a[1][1] = 30;
//        a[1][2] = 20;
//        a[1][3] = 20;
//        a[1][4] = 56;


        int a[][] = {{10,20,30},{40,50,60},{70,80,90}};

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        int b[][] = {{1,2,3},{4,5,6},{7,8,9}};

        for (int i = 0; i <3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }


    }
}
