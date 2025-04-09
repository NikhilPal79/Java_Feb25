package apr5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class FileHandling_RmvDuplicates {
    public static void main(String[] args) {

        String s = "The Fibonacci each sequence is a mathematical sequence in The Fibonacci each which each number is the sum of";
        System.out.println(s.length());
        System.out.println();

        ///  use split method to break single string into parts

        String[] strings = s.split(" ");

        System.out.println(Arrays.toString(strings));
        System.out.println(strings.length);
        System.out.println();

        /// to print duplicate elements

        Set<String> originals = new LinkedHashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();

        for (String element : strings) {
            /// if already seen its duplicate
            if (!originals.add(element)) {
                duplicates.add(element);

            }else {
                originals.add(element);
            }
        }

        System.out.println("AFTER REMOVING DUPLICATES : " + originals);
        System.out.println("DUPLICATES CHARACTERS : "+ duplicates);


    }
}