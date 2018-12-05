package examples;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class SomeFile {
    public void some () {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("someSome.txt"));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } catch (NullPointerException e){
            System.out.println("This is nonexistent File. Error: " + e);
        } finally {
            try {
                bufferedReader.close();
            } catch (NullPointerException e){
                System.out.println("This is nonexistent File. Error: " + e);
            } catch (IOException e) {
                System.out.println("Error: " + e);
            }
        }
    }
}
