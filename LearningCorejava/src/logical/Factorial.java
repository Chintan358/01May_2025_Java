package logical;

public class Factorial {
    public static void main(String[] args) {

        int number = 5;
        int fact = 1;
//        for(int i=1;i<=number;i++)
//        {
//            fact = fact*i;
//        }

        while(number!=0)
        {
            fact =fact*number;
            number--;
        }


        System.out.println("Factorila is : "+fact);


    }
}
