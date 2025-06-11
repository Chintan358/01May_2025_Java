package logicalpracticals;

public class PrimeNumber {

    public static void main(String[] args) {

        for(int j=3;j<=100;j++)
        {
            int number = j;
            int flag = 0;
            for(int i=2;i<number;i++)
            {
                if(number%i==0)
                {
                    flag = 1;


                }
            }

            if(flag==0)
            {
                System.out.println(number+ " : Prime");
            }
            else {
               // System.out.println(number+ " : Not prime");
            }
        }

    }

}
