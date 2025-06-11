package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F001_FileoutPutStream {
    public static void main(String[] args) {

        FileOutputStream fos=null;
        try {

            fos = new FileOutputStream("D:\\Files\\test.txt");
            String str = "this is my first io practical";
            byte b[] = str.getBytes();
            fos.write(b);
            System.out.println("success");


        } catch (IOException e) {
           e.printStackTrace();
        }
        finally{
            try {
                fos.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


    }
}
