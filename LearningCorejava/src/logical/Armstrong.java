package logical;

import oops.Emp;

public class Armstrong {
    public static void main(String[] args) {

        int number = 153;
        int temp = number;
        //1 + 125 + 27 = 153
        int sum = 0;
        while(number!=0) {
            int rem = number % 10;
            sum += (rem*rem*rem);
            number = number / 10;
        }

        if(temp==sum)
        {
            System.out.println(temp + " : is armstrong");
        }
        else {
            System.out.println(temp+" : is not armstrong");
        }



    }
}
