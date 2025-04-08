package mar29.FileHandlng4;

import java.io.File;
import java.io.IOException;

public class Read {
    public static void main(String[] args) {



    /*
    Java has several methods for creating, reading, updating, and deleting files.

    import java.io.File;  // Import the File class

    File myObj = new File("filename.txt"); // Specify the filename

    */

        /// HOW TO CREATE A FILE ?

        // comes from  io package,
        // but before it comes frm nio package

        File file = new File("NikFile.doc");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.canRead());
        System.out.println(file.getName());


        ///  file.packageName(press . to use if function)
        try
        {
            if (file.createNewFile()) {          ///  why it is giving error ??? there is an exception(checked{compile time})
                ///what if there is no file
                System.out.println(file.getName());
                /*System.out.println(file.exists());
                System.out.println(file.length());*/
            }/// putting the if block in try-catch exception
        }catch ( IOException e){
            e.printStackTrace();
        }

    }
}