package apr5;

import java.util.*;
import java.util.stream.Collectors;

public class Array {
    public static void main(String[] args) {

        int[] arr =  {10,34,53,23,53,32,34,53,232,53,54323,43,34};

        /*Set<Integer> s = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        System.out.println(s);*/

       /* Set<Integer> s = new LinkedHashSet<>();
        for (int num : arr) {
            s.add(num);
        }

        int[] result = new int[s.size()];
        int index = 0;
        for (int num : s) {
            result[index++] = num;
        }

        System.out.println(Arrays.toString(result));*/

        ///  CONVERT ARRAY IN LIST

        List<Integer> l1 = Arrays.asList(10, 34, 53, 23, 53, 32, 34, 53, 232, 53, 54323, 43, 34);
        System.out.println(l1);

        Set<Integer> set = new TreeSet<>(l1);
        System.out.println(set);

       /* https://www.freecodecamp.org/news/big-o-cheat-sheet-time-complexity-chart/*/

    }
}
