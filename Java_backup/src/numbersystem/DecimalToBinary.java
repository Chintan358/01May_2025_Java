package numbersystem;

public class DecimalToBinary {

    public static void main(String[] args) {

        int number = 25;
        int sum = 0;
        int mul = 1;
        while(number!=0)
        {
            int rem = number%2;
            sum = sum  + (rem*mul);

            number = number/2;
            mul*=10;
        }
        System.out.println(sum);

    }
}



