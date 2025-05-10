package EqualAndHashCodeContract.CASE3;

import java.util.Objects;

public class Student {

    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        return false;

    }

    @Override
    public int hashCode() {
        return 111 ;
    }
}
