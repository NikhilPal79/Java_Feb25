package InterviewQuestions.Interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterviewQuestions {
    public static void main(String[] args) {


        ///  https://www.youtube.com/watch?v=33kg60h0U-M&t=1565s&ab_channel=JavaJobDiaries

        System.out.println("create  a list of emp with salary and collect a list of emp those salary is more than 40k");


        Employee emp1 = new Employee(101,"nikhil", 40000);
        Employee emp2 = new Employee(102,"sawan",50000);
        Employee emp3 = new Employee(103,"mohit",20000);
        Employee emp4 = new Employee(104,"harp",30000);
        Employee emp5 = new Employee(105,"ridham",80000);

        ArrayList<Employee> employeeArrayList = new ArrayList<>();
        employeeArrayList.add(emp1);
        employeeArrayList.add(emp2);
        employeeArrayList.add(emp3);
        employeeArrayList.add(emp4);
        employeeArrayList.add(emp5);


        System.out.println(employeeArrayList);
        System.out.println();

        List<Employee> collect = employeeArrayList.stream().filter(x -> x.getSalary() > 40000).collect(Collectors.toList());

        System.out.println("list of emp whose have salary more than 40k " + collect);


        System.out.println("question 2 = apart from stream what java 8 features you have used");

        /// DATE API

        System.out.println("question 3 = TELL ME ABOUT THE JAVA 17 AND JAVA 21 FEATURES " );
        System.out.println("question 4 = SOLID PRINCIPLES " );
        /*
        S==> SINGLE RESPONSIBILITY
        O==> INPUT/OUTPUT PRINCIPLE
        L==> LISKOV SUBSTITUTION PRINCIPLE
        I==> INTERFACE SEGREGATION PRINCIPLE
        D==> DEPENDENCY INVERSION PRINCIPLE
        * */

        System.out.println("question 5 = RANGE ABOVE 40K AND BELOW 50K BY USING TWO DIFFERENT PREDICATE AND CLUB THEM");

        Predicate<Employee> above40k = employee -> employee.getSalary() >= 40000;
        Predicate<Employee> less60k = employee -> employee.getSalary() <= 60000;

        Predicate<Employee> club = above40k.and(less60k);

        List<Employee> collect1 = employeeArrayList.stream().filter(club).collect(Collectors.toUnmodifiableList());
        System.out.println(collect1);
        System.out.println();

        System.out.println("question 6 = WHAT IS IMMUTABILITY AND HOW WE DEAL WITH IT ");

        /*
        IMMUTABLE CLASSES ARE THOSE CLASSES WHICH CANT BE CHANGED OR ITS STATE CAN NOT BE CHANGED, ANY MODIFICATION CAN CREATE A NEW CLASS

        EXAMPLE OF IMMUTABLE CLASS ARE ===>STRING, INTEGER, LONG, DOUBLE, LOCAL DATE AND LOCAL TIME,

        WHY WE USE IMMUTABLE CLASSES BEC IT PROVIDES

        THREAD SAFETY
        SECURITY
        PREDICTABILITY

        WE CAN DEAL IMMUTABILITY BY USING BUILD PATTERN AND LOMBOK


/// We’ll create an immutable Employee class with a mutable field Address

          */

        System.out.println("question 7 = CREATE A MUTABLE LIST(employeeArrayList) TO IMMUTABLE LIST OF EMP"+ " TRY TO ADD ELEMENT SO THAT" +
                "IT WILL THROW EXCEPTION");

        /// use collectors.toUnmodifieablelist()

        try {


            List<Employee> listimmutable = employeeArrayList.stream().collect(Collectors.toUnmodifiableList());

            listimmutable.add(new Employee(108, "bawa", 65000));

            System.out.println("adding one more member " + listimmutable);

        } catch (Exception e) {
            System.out.println("Exception caught: Cannot modify an immutable list - " + e.getMessage());;
        }
    }
}
