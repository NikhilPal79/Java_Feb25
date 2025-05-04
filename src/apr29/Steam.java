package apr29;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Steam {
    public static void main(String[] args) {



        ///  create a mutable list


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

        System.out.println(list1);

        /// create a new list of even element from the above list and remove

        /// WITHOUT STREAM

        System.out.println("TRYING WITHOUT STREAM ");

        List<Integer> evenList = new ArrayList<>();

        List<Integer> oddList  = new ArrayList<>();

        for(Integer i : list1){
            if (i%2 == 0) {
                evenList.add(i);

            }else{
                oddList.add(i);
            }

        }

        System.out.println("original list : "+ list1);
        System.out.println("even list : "+ evenList);
        System.out.println("odd list : "+ oddList);
        System.out.println();
        System.out.println();


        /// the above code is boiler-plate code which repeats and cant be changed and doesnt add any logic

        /// WITH STREAM API

        System.out.println("TRYING WITH STREAM API ");


        List<Integer> evencollect = list1.stream().filter(e -> e % 2 == 0).collect(Collectors.toList());

        System.out.println("even collected list : "+evencollect);
        System.out.println();

        List<Integer> oddcollect = list1.stream().filter(o -> o % 2 != 0).collect(Collectors.toList());

        System.out.println("odd collected list : "+oddcollect);


        System.out.println();
        System.out.println("FETCHING NUMBERS MORE THAN 50");

        List<Integer> collected = list1.stream().filter(m -> m > 50).collect(Collectors.toList());

        System.out.println("numbers more than 50 : "+ collected);

    }
}
