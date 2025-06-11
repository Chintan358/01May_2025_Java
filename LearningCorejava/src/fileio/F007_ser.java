package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class F007_ser {

    public static void main(String[] args) {


        Student std = new Student();

        try {

            FileOutputStream fos = new FileOutputStream("D://Files//student.ser");
            ObjectOutputStream obj = new ObjectOutputStream(fos);
            obj.writeObject(std);
            System.out.println("Object written....");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
