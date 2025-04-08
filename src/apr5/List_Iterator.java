package apr5;

import java.util.*;

public class List_Iterator {
    public static void main(String[] args) {

     /*   Set<String> set = new LinkedHashSet<>();

        set.add("Nikhil");
        set.add("ridham");
        set.add("harp");
        set.add("shaffy");
        set.add("sawan");
        *//*set.add(null);*//*

        System.out.println(set);
        System.out.println(set.size());
        System.out.println();

        /// TRYING ListIterator

        *//*ListIterator<String> listIterator = list.listIterator();

        You're trying to call .listIterator() on a Set, but Set does not support indexing, so it doesn't have a ListIterator.*//*

        /// If you want to use ListIterator, first convert the Set to a List:

        List<String> list = new ArrayList<>(set);

        ListIterator<String> listIterator = list.listIterator();

        while (listIterator.hasNext()){
            String next = listIterator.next();{
                if (next == "Nikhil") {
                    listIterator.remove();
                }
            }
        }
        System.out.println(list);
        System.out.println(list.size());
        System.out.println();

*/

        /// TRYING WITH INTEGER

        Set<Integer> set1 = new LinkedHashSet<>();

        set1.add(12);
        set1.add(6);
        set1.add(46);
        set1.add(202);
        set1.add(491);
        set1.add(551);

        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println();


        ///  Using iterator

        Iterator<Integer> iterator = set1.iterator();

        while (iterator.hasNext()){
            Integer next = iterator.next();{
                if (next == 551) {
                    iterator.remove();

                }
            }
        }
        System.out.println(set1);
        System.out.println(set1.size());
        System.out.println();

        /// Using ListIterator

        ///  NOTE =======> TO USE LIST ITERATOR YOU NEED TO CONVERT THE SET INTO LIST

        List<Integer> list = new ArrayList<>(set1);

        ListIterator<Integer> listIterator1 = list.listIterator();

        while(listIterator1.hasNext()){
            Integer next = listIterator1.next();{
                if (next == 6) {
                    listIterator1.remove();

                }
            }
        }
        System.out.println(listIterator1.previousIndex());



    }
}
