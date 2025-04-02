package apr1.CustomizedArrayList;

import java.util.ArrayList;
import java.util.List;

public class EmpMain {
    public static void main(String[] args) {


        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"nikhil"));
        list.add(new Employee(102,"ridahm"));
        list.add(new Employee(103,"rohit"));
        list.add(new Employee(104,"tirath"));
        list.add(new Employee(105,"mohit"));
        list.add(new Employee(106,"gurwinder"));


        System.out.println(list);
    }
}
