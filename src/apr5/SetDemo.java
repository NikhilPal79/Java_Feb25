package apr5;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {

        ///  trying SET
        Set<Integer> set = new HashSet<>();

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

        ///  TRYING TREESET

        Set<Integer> t = new TreeSet<>();
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

        ///  TRYING LINKEDSET

        Set<Integer> l =  new LinkedHashSet<>();
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
