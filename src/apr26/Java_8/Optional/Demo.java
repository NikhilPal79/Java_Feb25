package apr26.Java_8.Optional;

import java.util.Optional;

public class Demo {
    public static void main(String[] args) {

        /// to handle null value exception

        String str = "i am learning java";

        if (str == null) {
            System.out.println("this is null object");
        }else{
            System.out.println(str.length());
            System.out.println();
        }

        /// need to create optional

        Optional<String> string = Optional.ofNullable(str);

        System.out.println(string.get().length());
        System.out.println(string.isPresent());
        System.out.println(string.orElse("no value is this object"));


    }
}
