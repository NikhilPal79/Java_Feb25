package apr8.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeMain {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add( new Employee(5072,"nikhil",3616.00));
        employeeList.add( new Employee(2122,"karan",6416.00));
        employeeList.add( new Employee(6486,"ajay",9416.00));
        employeeList.add( new Employee(5565,"ram",5616.00));


        System.out.println("before sorting : "+employeeList);
        System.out.println();

        Collections.sort(employeeList);
        System.out.println("after sorting : "+employeeList);



    }
}
