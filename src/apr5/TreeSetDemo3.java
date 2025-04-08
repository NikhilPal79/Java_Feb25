package apr5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo3 {
    public static void main(String[] args) {

        Set<Integer> set = new TreeSet<>();
        set.add(16);
        set.add(94);
        set.add(11);
        set.add(164);
        set.add(661);
        set.add(441);
        set.add(6);
        /*set.add(null);*/

        System.out.println(set);
        System.out.println();

        /// Trying Iterator with TreeSet

        Iterator<Integer> itr = set.iterator();

        while(itr.hasNext()){
            Integer next = itr.next();
            if (next == 661) {
                itr.remove();
            }
        }
        System.out.println(set);

    }

}

