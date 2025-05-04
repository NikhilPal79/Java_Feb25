package apr29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SteamObject {
    public static void main(String[] args) {

        /// HOW TO GET STREAM OBJECT

        System.out.println("1. EMPTY METHOD ");
        System.out.println("performing stream function on object 'empty' ");
        System.out.println("not getting any data ");

        Stream<Object> empty = Stream.empty();

        empty.forEach(e  -> {
            System.out.println(e);

        });
        System.out.println();

        System.out.println("2. ARRAY , OBJECT, COLLECTION  ");
        System.out.println("suppose we have array of string ");

        String name[ ] = {"nik","harp","sawan","ridham","mohit","rohit"};

        Stream<String> name1 = Stream.of(name);

        name1.forEach(e ->{
            System.out.println(e);
        });

        List<String> r = Stream.of(name).filter(n -> n.startsWith("r")).collect(Collectors.toList());

        System.out.println("list of names starts with r : "+r);
        System.out.println();

        System.out.println("3. STREAM BUILDER ");

        Stream<Object> build = Stream.builder().build();
        build.forEach(e ->{
            System.out.println(e);
        });

        System.out.println();

        System.out.println("4. USING ARRAYS.STREAM");

        IntStream stream = Arrays.stream(new int[]{2, 4, 5, 6, 2, 5, 8496, 4, 613});
        stream.forEach(e->{
            System.out.println(e);
        });

        System.out.println();

        System.out.println("5. COLLECTION (LIST, SET ) IMPORTANT ONE ");
        System.out.println("applying stream function on object of list as list1");
        List<Integer> list1 = new ArrayList<>();

        list1.add(2);
        list1.add(4);
        list1.add(33);
        list1.add(8945);
        list1.add(99);
        list1.add(89);
        list1.add(49);
        list1.add(23);
        list1.add(10);
        list1.add(12);
        list1.add(14);

        List<Integer> collected = list1.stream().filter(m -> m % 2 == 0).collect(Collectors.toList());

        System.out.println("even list numbers : " + collected);


    }
}
