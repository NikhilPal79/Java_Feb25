package apr29;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {


        List<String> name = Arrays.asList("nikhil","sawan","ridham","rohit","harp","mohit");

        System.out.println("list of names : " + name);
        System.out.println("FILTER OUT NAME STARTING FROM R ");
        System.out.println("EXAMPLE OF FILTER ");
        List<String> stringList = name.stream().filter(e -> e.startsWith("r")).collect(Collectors.toList());
        System.out.println("list of name starts with R : " + stringList);
        System.out.println();

        System.out.println("EXAMPLE OF ******   ******  MAP ******** ********");
        System.out.println();

        List<Integer> integerList = Arrays.asList(12,123,324,98,46,3265,464,6532,88);
        System.out.println("task ====> square number and return the value ");

        System.out.println("list of given numbers : " + integerList);

        List<Integer> collected = integerList.stream().map(i -> i * i).collect(Collectors.toList());

        System.out.println("list of square of given numbers : " + collected);

        System.out.println("USE OF SORTED");
        integerList.stream().sorted().forEach(System.out::println);
        System.out.println();

        System.out.println("USE OF MINIMUM ");
        Integer i = integerList.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println("minimum number : " + i);
        System.out.println();

        System.out.println("USE OF MAXIMUM");
        Integer i1 = integerList.stream().max((x, y) -> x.compareTo(y)).get();
        System.out.println("maximum number : " + i1);
        System.out.println();

    }
}
