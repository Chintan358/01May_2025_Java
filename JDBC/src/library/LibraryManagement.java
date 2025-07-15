package library;

import java.util.Scanner;

public class LibraryManagement {

    public static void main(String[] args) {

        String str = "y";
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter opration : ");
            System.out.println("1 : Add Book");
            System.out.println("2 : View Book");
            System.out.println("3 : Delete Book");
            System.out.println("4 : Issue Book");
            int choice = sc.nextInt();

            LibraryOpration op = new LibraryOpration();

            if (choice == 1) {
                System.out.println("**************Add Book*****************");
                op.addBook();

            } else if (choice == 2) {
                System.out.println("**************View Book*****************");
                op.viewBook();

            } else if (choice == 3) {
                System.out.println("**************Delete Book******************");
                op.deleteBook();

            } else if (choice == 4) {
                System.out.println("**************Issue Book******************");
                op.issueBook();

            } else {
                System.out.println("Invalid choice");
            }

            System.out.println("do u want to continue ? y/n");
            str = sc.next();
        }while(!str.equalsIgnoreCase("n"));
    }
}
