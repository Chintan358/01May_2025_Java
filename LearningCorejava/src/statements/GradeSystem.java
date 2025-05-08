package statements;

import java.util.Scanner;

public class GradeSystem {
    public static void main(String[] args) {

        String choice="N";
        do {


            Scanner sc = new Scanner(System.in);
            System.out.println("Enter MArks : ");
            int marks = sc.nextInt();

            if (marks >= 91 && marks <= 100) {
                System.out.println("Grade A");
            } else if (marks >= 71 && marks <= 90) {
                System.out.println("Grade B");
            } else if (marks >= 51 && marks <= 70) {
                System.out.println("Grade C");
            } else if (marks >= 35 && marks <= 50) {
                System.out.println("Grade D");
            } else if (marks >= 0 && marks < 35) {
                System.out.println("Grade F");
            } else {
                System.out.println("Invalid Choice");
            }

            System.out.println("Do you want to continue ? Y or N");
            choice = sc.next();

        }while(!choice.equalsIgnoreCase("n"));



    }
}
