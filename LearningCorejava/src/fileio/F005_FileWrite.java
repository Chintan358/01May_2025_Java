package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F005_FileWrite {

    public static void main(String[] args) {

        FileWriter fw = null;

        try {
            fw = new FileWriter("D://Files//home.txt");

            String str = "This is my first write program";

            fw.write(str);
            fw.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
