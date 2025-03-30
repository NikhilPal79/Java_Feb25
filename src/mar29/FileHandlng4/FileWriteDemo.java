package mar29.FileHandlng4;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {
    public static void main(String[] args) {

        writeToFile();

    }

    ///  creating a method

    public static void writeToFile(){
        try {
            FileWriter fileWriter = new FileWriter("demo.txt");
            fileWriter.write("hey i am learning java.");
            System.out.println("file has been written");
            fileWriter.write(" file write function is getting interesting");
            ///  this can not allow to write on the file, only then allow when you close the file
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        /// **********************NOW TRY TO WRITE IN FILE WITH RESOURCES***************************************


    }

    ///  creating another method

    /*public static void writeToFileWithResources(){

        try (FileWriter fileWriter = new FileWriter("mak.txt")){


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }*/
}
