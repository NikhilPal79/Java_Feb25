package apr5;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSetDemo4 {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Nikhil");
        set.add("ridham");
        set.add("harp");
        set.add("shaffy");
        set.add("sawan");
        /*set.add(null);*/

        System.out.println(set);
        System.out.println();

        /// Creating basic Iterator

        Iterator<String> stringIterator = set.iterator();

        while(stringIterator.hasNext()){
            String next = stringIterator.next();
            if (next == "Nikhil") {
                stringIterator.remove();
            }
        }
        System.out.println(set);
    }

}

