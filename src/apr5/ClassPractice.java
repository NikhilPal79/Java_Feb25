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


        ///  FIND THE DUPLICATE FROM THE ARRAY.






    }
}
