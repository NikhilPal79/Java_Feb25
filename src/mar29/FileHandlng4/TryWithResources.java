package mar29.FileHandlng4;

import java.io.FileWriter;
import java.io.IOException;

public class TryWithResources {
    public static void main(String[] args) {

        writeToWithResources();
    }

    ///  creating a method

    public static void writeToWithResources(){

        try(FileWriter fileWriter = new FileWriter("nik.txt")){
            fileWriter.write("hey i am learning java.");
            System.out.println("file has been written");
            fileWriter.write(" file write function is getting interesting");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
