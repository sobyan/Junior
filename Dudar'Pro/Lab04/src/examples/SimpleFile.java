package examples;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.FileReader;


public class SimpleFile {

    public void simple () {
        BufferedReader bufferedReader = null;
        try {
            File file = new File("hi.txt");
            if (file.exists()) {
                file.createNewFile();
            }
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.println("Some simple string");
            printWriter.close();

            bufferedReader = new BufferedReader(new FileReader("hi.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
