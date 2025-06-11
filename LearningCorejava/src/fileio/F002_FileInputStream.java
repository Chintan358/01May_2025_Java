package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F002_FileInputStream {
    public static void main(String[] args) {


        FileInputStream fis = null;

        try {
            fis = new FileInputStream("D://files//test.txt");


            int i =   fis.read();

            while(i!=-1)
            {
                char ch = (char) i;
                System.out.print(ch);
                i = fis.read();

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
