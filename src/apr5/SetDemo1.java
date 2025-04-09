package apr5;

import java.util.*;

public class SetDemo1 {
    public static void main(String[] args) {

        ///  trying SET
        // 1. stores unique values(no duplicates )
        // 2. does not have order
        // 3. can have null but just 1.

        Set<Integer> set = new HashSet<>();

        ///  RANDOM ORDER, ALLOW THE NULL ELEMENT JUST 1.

        set.add(15);
        set.add(80);
        set.add(1512);
        set.add(61);
        set.add(61);
        set.add(7581);
        set.add(null);

        System.out.println(set);
        System.out.println(set.remove(61));
        System.out.println(set);
        System.out.println();




        Set<String> s = new HashSet<>();
        /// RANDOM ORDER, ALLOW THE NULL ELEMENT JUST 1.
        s.add("Nikhil");
        s.add("neeraj");
        s.add("simran");
        s.add("simran");
        s.add("yadava");
        s.add("manmeet");
        s.add("null");

        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.remove("Nikhil"));
        System.out.println(s);
        System.out.println();


        ///  TRYING TREE SET

        Set<Integer> t = new TreeSet<>();
        /// NATURAL SORTING ORDER, NO NULL IS ALLOWED
        t.add(50);
        t.add(8222);
        t.add(1313);
        t.add(1313);
        t.add(8);
        /*t.add(null);*/
        t.add(99);

        System.out.println(t);
        System.out.println(t.size());
        System.out.println(t.add(5000));
        System.out.println(t);
        System.out.println();

        ///  TRYING LINKED SET

        Set<Integer> l =  new LinkedHashSet<>();
        /// ORDER IS MAINTAINED INSERTION ORDER
        l.add(45);
        l.add(95);
        l.add(115);
        l.add(155);
        l.add(805);
        l.add(4205);
        l.add(null);
        l.add(4205);

        System.out.println(l);
        System.out.println();


    }
}
