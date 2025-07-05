package numbersystem;

public class DecimalToHexa {

    public static void main(String[] args) {

        int number = 8000;
        String num="";
        while(number!=0)
        {
            int rem = number%16;
            if(rem>=10)
            {
                char i = (char)(55+rem);
                num = i+num;
            }
            else {
                num = rem+num;
            }


            number = number/16;
        }
        System.out.println(num);

    }
}



