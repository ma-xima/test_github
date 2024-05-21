package exceptions;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
//SELBST
public class PrintWriterExample {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            PrintWriter printWriter = new PrintWriter("test.txt");
            printWriter.println(LocalDateTime.now().toString());
            printWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//C:\Users\Maxima\git\test_github