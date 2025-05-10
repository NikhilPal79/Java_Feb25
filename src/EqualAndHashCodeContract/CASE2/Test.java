package EqualAndHashCodeContract.CASE2;

import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {

        /// CASE 2 ====>WHEN WE ARE NOT IMPLEMENTING THE CONTRACT

        Student s1 = new Student(101,"mayank");
        Student s2 = new Student(101,"mayank");

        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode() == s2.hashCode());
        System.out.println();
        System.out.println("********************* IMPLEMENTATION OF HASHMAP *****************");


        Map<Student, String> map = new HashMap<>();

        System.out.println(map.put(s1, "A"));
        System.out.println(map.put(s2, "A"));


    }
}
