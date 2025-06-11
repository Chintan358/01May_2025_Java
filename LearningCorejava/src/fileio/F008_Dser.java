package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class F008_Dser {

    public static void main(String[] args) {


        try {
            FileInputStream fis = new FileInputStream("D://Files//student.ser");
            ObjectInputStream obj = new ObjectInputStream(fis);
            Student st = (Student)  obj.readObject();
            st.display();


        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
