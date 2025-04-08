package apr5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
    public static void main(String[] args) {


        Set<Integer> set = new HashSet<>();

        set.add(25);
        set.add(50);
        set.add(75);
        set.add(100);
        set.add(125);
        set.add(null);

        System.out.println(set);

        ///  using iterator for Hashset

        ///  BASIC ITERATOR

        Iterator<Integer> itr = set.iterator();

        ///  REMOVING ELEMENT

            while (itr.hasNext())
            {

                Integer next = itr.next();

                try {if (next == 125 && next != null) {
                    itr.remove();

                }
                }catch (NullPointerException e) {
                    e.printStackTrace();
                }
        }
        System.out.println(set);


    }
}
