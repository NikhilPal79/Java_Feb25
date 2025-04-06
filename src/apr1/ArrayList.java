package apr1;

import java.util.List;

public class ArrayList {
    public static void main(String[] args) {


        List<Integer> list = new java.util.ArrayList<>();
        list.add(44);
        list.add(42);
        list.add(94);
        list.add(414);
        list.add(544);
        list.add(24);
        list.add(24);
        list.add(null);


        System.out.println(list);

        List<Integer> list1 = new java.util.ArrayList<>();
        list1.add(23);
        list1.add(27);
        list1.add(91);


        list.addAll(list1);
        System.out.println(list);

        System.out.println(list.get(5));
        list.add(10,5000);
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.hashCode());



    }

}
