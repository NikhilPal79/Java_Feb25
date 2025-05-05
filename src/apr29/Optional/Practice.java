package apr29.Optional;

import java.util.Optional;

public class Practice {


    public static Optional<String> getName(){
        String name = "mayank";
        return Optional.ofNullable(name);
    }


    public static void main(String[] args) {

        Optional<String> name = getName();

        System.out.println(name.isPresent());
        System.out.println();
        System.out.println(name.orElse("nothing in the string"));

    }
}
