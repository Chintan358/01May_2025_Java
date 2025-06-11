package logicalpracticals;

public class Factorial {
    public static void main(String[] args) {

        int number = 5 ;
        int fact = 1;
        for (int j=5;j>=1;j--)
        {
            fact *=j;
        }

        System.out.println("Factoral is : "+fact);


    }
}
