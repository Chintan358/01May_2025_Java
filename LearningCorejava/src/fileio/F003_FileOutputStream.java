package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class F003_FileOutputStream {


    public static void main(String[] args) {


        Scanner sc  =new Scanner(System.in);
        System.out.println("enter name : ");
        String name = sc.next();
        System.out.println("enter email : ");
        String email = sc.next();


        FileOutputStream fos=null;
        try {
            fos = new FileOutputStream("D:\\Files\\"+name+".txt");

           // String str = "Something.....";

            byte b[] = email.getBytes();

            fos.write(b);

            System.out.println("Success");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        finally{
            if(fos!=null)
            {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }


    }



}
