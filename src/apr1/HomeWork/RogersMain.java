package apr1.HomeWork;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RogersMain {
    public static void main(String[] args) {

        ///  ASSIGNMENT == CALCULATE HIGHEST SALARY WITH THE EMPLOYEE NAME
        /// 2ND ====> USING STREAM API

        /// TO GET SALARY ADD GETTER

        List<Rogers> list = new ArrayList<>();
        list.add(new Rogers(5072,"nikhil", 60000));
        list.add(new Rogers(6846,"ajay",74000));
        list.add(new Rogers(5655,"ramneek",72000));
        list.add(new Rogers(7544,"harpinder",56000));
        list.add(new Rogers(2122,"karan",55000));
        list.add(new Rogers(1097,"sukh",62000));
        list.add(new Rogers(1797,"guri",66100));

        System.out.println(list);
        System.out.println();

        ///  suppose List first index is maxSalary then convert it int variable

        Rogers MaxSalary = list.get(0);

        for (Rogers e : list) {
            if (e.salary > MaxSalary.salary) {
                MaxSalary = e;

            }
        }
        System.out.println(MaxSalary);



       /* System.out.println(list.stream().min(Comparator.comparingDouble(Rogers::getSalary)).orElse(null));
        System.out.println();
        System.out.println(list.stream().max(Comparator.comparingDouble(Rogers::getSalary)).orElse(null));
        System.out.println();
        System.out.println(list.stream().max(Comparator.comparingDouble(Rogers::getId)).orElse(null));
        System.out.println();
        System.out.println(list.stream().min(Comparator.comparingDouble(Rogers::getId)).orElse(null));*/

    }
}
