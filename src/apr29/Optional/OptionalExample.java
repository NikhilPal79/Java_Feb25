package apr29.Optional;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        String str = "java is my favorite language";

        /// 1. need to create optional

        Optional<String> string = Optional.ofNullable(str);

        System.out.println(string.isPresent());

        System.out.println(string.get());

        System.out.println(string.filter(e -> e.startsWith("is")));

        /// use of or-else if value is there --- print value if not -- print whatever you write in or-else.

        String string1 = null;

        Optional<String> string2 = Optional.ofNullable(string1);

        System.out.println(string2.isPresent());

        System.out.println(string2.orElse("there is nothing in string "));




    }
}
