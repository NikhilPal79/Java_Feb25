package apr1;

import java.util.ArrayList;
import java.util.List;

public class CharList {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("nikhil");
        list.add("neeraj");
        list.add("manmeet");
        list.add("ankita");
        list.add("yadav");
        list.add("simran");

        System.out.println(list);

        System.out.println(list.size());
        list.add("Pragra");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list.add("coder");
        list.add("hacker");
        list.add("developer");
        list.add("front end");
        list.add("back end");

        list.addAll(list1);

        System.out.println(list);

        System.out.println(list.remove(6));
        System.out.println(list);

        List<String> list3 = new ArrayList<>();
        list.add("20");
        list.add("30");
        list.add("40");

        System.out.println(list3);

        list.addAll(list3);

        System.out.println(list);
    }
}
