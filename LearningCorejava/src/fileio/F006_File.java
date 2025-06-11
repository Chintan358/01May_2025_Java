package fileio;

import java.io.File;
import java.io.IOException;

public class F006_File {
    public static void main(String[] args) {


        File file = new File("D:/Files/test.txt");

//        System.out.println(file.exists());
//
//        try {
//            file.createNewFile();
//            System.out.println("file created...");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }

//        file.delete();


//        file.mkdir();


//        System.out.println(file.isFile());
//        System.out.println(file.isDirectory());


        file.setReadable(false);

    }
}
