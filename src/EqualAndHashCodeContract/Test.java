package EqualAndHashCodeContract;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student(1,"nikhil");
        Student s2 = new Student(1,"nikhil");


        System.out.println(s1.equals(s2));

        System.out.println(s1.hashCode() == s2.hashCode());

        System.out.println("AS PER THE CONTRACT IF TWO OBJECT ARE EQUAL THAN THEIR HASHCODE METHOD MUST RETURN SAME VALUE " +
                "WHICH MEANS HERE HASHCODE ARE THEIR ROLL NUMBERS ");

    }
}
