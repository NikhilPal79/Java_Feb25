package EqualAndHashCodeContract.CASE3;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student(101,"nikhil");
        Student s2 = new Student(102,"mayank");

        System.out.println(s1.equals(s2) + " ===>false bcz of diff objects in heap memory ======> ");
        System.out.println();
        System.out.println(s1.equals(s1) + " ===> true bcz returning false in override method =======>");
        System.out.println();
        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println("true bcz of override method of hashcode is returning the same value 111");
        System.out.println();
        System.out.println(s1.hashCode() == s1.hashCode());
        System.out.println("true bcz of override method of hashcode is returning the same value 111");
        System.out.println();

        System.out.println("***********   IMPLEMENTATION OF HASHMAP **************");

        Map<Student,String> stringMap = new HashMap<>();

        System.out.println(stringMap);

        stringMap.put(s1,"a");
        stringMap.put(s2,"a");

        stringMap.put(s1,"a");
        stringMap.put(s1,"a");





    }
}
