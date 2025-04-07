package apr5;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ClassPractice {
    public static void main(String[] args) {

        ///  GIVEN ARRAY

        ///  TASK ===> REMOVE THE DUPLICATES

        int[] arr = {10, 34, 53, 23, 53, 32, 34, 53, 232, 53, 54323, 43, 34};

        List<Integer> list = Arrays.asList(10, 34, 53, 23, 53, 32, 34, 53, 232, 53, 54323, 43, 34);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        ///  given array is converted into list

        ///  to remove the duplicate we need to convert list into set as set store the unique values


        Set<Integer> set = new HashSet<>(list);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println();


        ///  FIND THE DUPLICATE FROM THE ARRAY.

        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();


        ///  seen.add(num) returns false if the number was already in the set.
        ///  We then add that number to the duplicates set.

        for (int num : arr) {
            if (!seen.add(num)){
                duplicates.add(num);
            }
        }

        System.out.println("Duplicates : " + duplicates);

        System.out.println(duplicates.size());


    }
}
/* https://www.freecodecamp.org/news/big-o-cheat-sheet-time-complexity-chart/*/