package basic;

import java.util.Scanner;

public class ScannerDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a : ");
        int a = sc.nextInt();
        System.out.println("Enter b : ");
        double b =sc.nextDouble();
        System.out.println("enter name : ");
        String name = sc.next();
        System.out.println("enter fullname");
        sc.nextLine();
        String fullname = sc.nextLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(name);
        System.out.println(fullname);
    }
}
