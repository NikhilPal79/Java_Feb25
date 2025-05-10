package EqualAndHashCodeContract;

import java.util.Objects;

public class Student {

    private int rollNum;
    private String name;

    public Student(int rollNum, String name) {
        this.rollNum = rollNum;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNum=" + rollNum +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNum == student.rollNum && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNum, name);
    }
}
