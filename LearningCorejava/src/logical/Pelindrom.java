package logical;

public class Pelindrom {
    public static void main(String[] args) {

        int number = 12321;
        int temp = number;
        int sum = 0;
        while(number!=0)
        {
            int rem = number%10;
            sum = sum*10+rem;
            number = number/10;
        }
       // System.out.println(sum);
        if(temp==sum)
        {
            System.out.println("Number is pelindrom");
        }
        else {
            System.out.println("Number is not pelindrom");
        }

    }
}
