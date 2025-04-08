package apr5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ClassAssign {
    public static void main(String[] args) {


        /*
        ForLoops
        Iterator
        Create ListIterator
        Use iterator for HashSet


        Smallest and largest number in arraylist
        Numbers greater than 10 and less than 10*/


        List<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(19);
        list.add(15);
        list.add(17);
        list.add(441);
        list.add(75);
        list.add(5);
        list.add(8);
        list.add(4);

        System.out.println(list);
        System.out.println();

        /// FIND MINIMUM OF THE ARRAY LIST

        // Assume first element is maximum

        int max = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }

        }

        System.out.println("Maximum of ArrayList : " + max);
        System.out.println();


        /// FIND MINIMUM OF THE ARRAY LIST

        // Assume first element is minimum

        int min = list.get(0);

        for (int i = 1; i < list.size(); i++) {
            if(list.get(i) < min ){
                min = list.get(i);
            }

        }
        System.out.println("Minimum of ArrayList : "+ min);


        ///  FIND NUMBER GREATER THAN 10 in Array list ?

        for (Integer e : list) {

            if (e > 10) {
                System.out.println(e);

            }


        }
        System.out.println();

        ///  FIND NUMBER LESS THAN 10 in Array list ?

        for (Integer e : list) {

            if (e < 10) {
                System.out.println(e);

            }

        }





    }
}
