package apr5;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
    public static void main(String[] args) {

        int[] arr =  {10,34,53,23,53,32,34,53,232,53,54323,43,34};


        ///  converting array into list

        List<Integer> list = Arrays.asList(10, 34, 53, 23, 53, 32, 34, 53, 232, 53, 54323, 43, 34);

        /*Collections.sort(10,34,53,23,53,32,34,53,232,53,54323,43,34);*/
        Collections.swap(list, 0,10);
        System.out.println(list);
        System.out.println();



        ///  HOW TO TRAVERSE A LIST ?????
        // TRAVERSE =====> GO THROUGH EACH AND EVERY ELEMENT

        for (Integer e : list) {
            System.out.println(e);
            ///  for every integer element of list /// print elements
        }




    }
}
