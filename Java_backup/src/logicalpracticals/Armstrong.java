package logicalpracticals;

public class Armstrong {
    public static void main(String[] args) {


        int number = 153;
        int temp = number;

        int sum = 0;
        while(number !=0)
        {
            int rem  = number%10;
            sum +=(rem*rem*rem);
            number=number/10;
        }

        if(temp==sum)
        {
            System.out.println("Armstrong");
        }
        else {
            System.out.println("Not armstrong  " +
                    "");
        }


    }
}
