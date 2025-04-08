package apr5;

import java.util.*;

public class ArrayClass {
    public static void main(String[] args) {

        ///  arrays can be converted into lists

        int[] arr =  {10,34,53,23,53,32,34,53,232,53,54323,43,34};

        Arrays.sort(arr);


        ///  above sort function will not give you output

        System.out.println(Arrays.toString(arr));
        System.out.println();

        // using Arrays.as list method and then convert it in a variable

        List<Integer> list = Arrays.asList(10, 23, 32, 34, 34, 34, 43, 53, 53, 53, 53, 232, 54323);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
        /*System.out.println(list.remove(Integer.valueOf(53)));*/ /// giving exception that they are unable to remove all 53 in list
        System.out.println(list);
        System.out.println();


        /// using set to remove all 53

        ///  convert list into set

        Set<Integer> set = new TreeSet<>(list);

        System.out.println(set);
        System.out.println(set.size());
        System.out.println();

        System.out.println(set.remove(53));
        System.out.println(set);
        System.out.println(set.size());


    }
}
