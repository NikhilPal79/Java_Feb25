package mar29.FileHandlng4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class FileReadDemo {
    public static void main(String[] args) {
        readFromFile();

    }

    public static void  readFromFile(){

        try {
            FileReader fileReader = new FileReader("demo.txt");

            int characters;

            while ((characters = fileReader.read()) != -1){
                System.out.println((char) characters);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
