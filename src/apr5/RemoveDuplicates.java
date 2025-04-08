package apr5;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) throws IOException {

       ///  READ IT FROM FILES
        ///  FIND THE DUPLICATES

        ///  REMOVE DUPLICATES

        // GET A EXISTING FILE
         File file = new File("C:\\Users\\NIKHIL\\IdeaProjects\\Feb2025\\demo.txt");

         /// READ CONTENT

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        /*
        FileReader reader = new FileReader("demo.txt");

        int c;

        while ((c = reader.read()) != -1){
            char ch = (char) c;
            System.out.println(ch);

        }*/

        /// TRYING METHOD RealAllLines

        List<String> string = Files.readAllLines(Paths.get("C:\\Users\\NIKHIL\\IdeaProjects\\Feb2025\\demo.txt"));

        System.out.println(string);
        System.out.println(string.size());
        System.out.println();



        /// TO REMOVE THE DUPLICATES WE CAN CONVERT THE FILES INTO SET(linkedHashSet)(AS SET DO NOT ALLOW DUPLICATES )

        Set<String> unique = new LinkedHashSet<>(string);

        System.out.println(unique);
        System.out.println(unique.size());

        /// TO FIND THE DUPLICATES

        List<String> duplicates = new ArrayList<>(string);

        System.out.println(duplicates);
        System.out.println(duplicates.size());

        String line;

        while ((line = bufferedReader.readLine()) != null){
            if (! unique.add(line)) {
                duplicates.add(line);
            }

        }
        /*bufferedReader.close();*/

        for ( String e : unique) {
            System.out.println(e);

        }

        for (String e2 : duplicates ) {
            System.out.println(e2);
        }

        FileWriter writer = new FileWriter("demo.txt");

        for (String l : unique) {
            writer.write(l + System.lineSeparator());
        }


    }
}
