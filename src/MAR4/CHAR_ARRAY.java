package MAR4;

public class CHAR_ARRAY {
    public static void main(String[] args) {

        ///  STRING

        ///  string is sequence od character
        ///  string is immutable (we cant change/modify) in terms of memory

        // 1. character array
        // 2. string is a class
        // 3. non-primitive data type

        /// 2 WAYS TO CREATE STRING
        /*
        1. USING STRING LITERAL

        String name = "Pragra" {THIS name is stored in stack while PRAGRA is giong to stored in STRING CONSTANT POOL IN HEAP}

        String myName = "Pragra"{myName in stack and Pragra in STRING CONSTANT POOL IN HEAP}

        2. NEW KEYWORD

        String name = new String("Pragra") {in this Pragra directly stored in heap as object }

         */
        String name = "pragra";
        String company = "pragra";
        String mycompany = "pragra";

        String s = new String("pragra");

        System.out.println(name.equals(s)); /// check the contents
        System.out.println(name == s);  /// check the reference

    }
}
