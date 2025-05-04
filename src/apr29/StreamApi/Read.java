package apr29.StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Read {
    public static void main(String[] args) {



        /// create a list and filter all even numbers from list

        /// two diffrent ways to create list
        List<Integer> list1 = Arrays.asList(2, 4, 6, 8, 10, 12);

        /// this is un-mutable list we can not add element in later

        System.out.println(list1);
        System.out.println();
        /*list1.add(42);*/

        System.out.println(list1);
        System.out.println();


        List<Integer> list2 = new ArrayList<>();

        ///  this is mutable list we can add the element later
        list2.add(61);
        list2.add(465);
        list2.add(9946);
        list2.add(3030);
        list2.add(98);

        System.out.println(list2);
        list2.add(46);
        System.out.println();
        System.out.println(list2);


    }
}
