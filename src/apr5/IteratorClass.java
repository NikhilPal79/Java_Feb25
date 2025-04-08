package apr5;

import java.util.*;
import sun.text.normalizer.UnicodeSetIterator;

public class IteratorClass {
    public static void main(String[] args) {


        ///  Iterator ===> it is an interface

        ///  WHT THERE IS NEED OF ITERATOR ??

        LinkedList<Integer> list =  new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

        /*for (Integer e : list) {
            if (list.contains(10)) {
                list.remove();
            }

        }
        System.out.println(list);*/

        ///  THE ABOVE CODE IS GIVING US EXCEPTION BECAUSE WE ARE TRYING TO LOOP AND REMOVE{modifying} AT SAME TIME

        ///  TO SOLVE THIS PROBLEM WE USE ITERATOR, or we can say to bypass the ConcurrentModification they create Iterator

        /*if (list.contains(10)) {
            list.remove(2);

        }
        System.out.println(list);*/

        ///  ITERATOR


        ///  Iterator basic


        // BASIC ITERATOR

        /* Iterator<Integer> itr = list.iterator();*/


        ///  REMOVING THE ELEMENT
        Iterator<Integer> itr = list.iterator();



        while (itr.hasNext()){

            Integer next = itr.next();

            if(next == 30 || next == 70){
                itr.remove();

            }

        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();


        ///  trying listIterator{not important }


        ListIterator<Integer> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            Integer next = listIterator.next();

            if (next == 80 || next == 10) {
                listIterator.remove();

            }
        }

        System.out.println(list);
        System.out.println(list.size());
        System.out.println();
        System.out.println(listIterator);


    }


}
