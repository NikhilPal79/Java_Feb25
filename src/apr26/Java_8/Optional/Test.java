package apr26.Java_8.Optional;

import java.util.Optional;

public class Test {

    public static Optional<String> student() {
        String name = "nikhil";
        return Optional.ofNullable(name);
    }


    public static void main(String[] args) {

        Optional<String> optionalS = student();
        System.out.println(optionalS.get().length());
        System.out.println(optionalS.isPresent());
        System.out.println(optionalS.orElse("this is null value"));

    }
}
