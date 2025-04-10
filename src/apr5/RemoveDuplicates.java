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

        String a = "Contrary to popular belief, Lorem Ipsum is not simply random text. It has roots in a piece of classical Latin literature from 45 BC, making it over 2000 years old. Richard McClintock, a Latin professor at Hampden-Sydney College in Virginia, looked up one of the more obscure Latin words, consectetur, from a Lorem Ipsum passage, and going through the cites of the word in classical literature, discovered the undoubtable source. Lorem Ipsum comes from sections 1.10.32 and 1.10.33 of de Finibus Bonorum et Malorum (The Extremes of Good and Evil) by Cicero, written in 45 BC. This book is a treatise on the theory of ethics, very popular during the Renaissance. The first line of Lorem Ipsum Lorem ipsum dolor sit amet. comes from a line in section ";

        System.out.println(a);
        System.out.println(a.length());
        System.out.println();

        ///  split the string into every single character
        ///  save it as an array because for each loop only applies to array

        String[] splitString = a.split(" ");

        System.out.println(splitString);
        System.out.println(splitString.length);
        System.out.println();

        ///  create set for originals and duplicates

        Set<String> originals = new LinkedHashSet<>();
        Set<String> duplicates = new LinkedHashSet<>();


        for (String element : splitString) {

            if (!originals.add(element)) { /// if already add to duplicates
                duplicates.add(element);
            }else {
                originals.add(element);
            }

        }

        System.out.println(originals);
        System.out.println();
        System.out.println(duplicates);


    }
}
