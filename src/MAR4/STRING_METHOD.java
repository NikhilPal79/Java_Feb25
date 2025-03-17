package MAR4;

public class STRING_METHOD {
    public static void main(String[] args) {

        String s1 = "nikhil";

        ///  USING DIFFERENT METHODS FOR STRING

        /// TYPE s1.

        System.out.println(s1.length()); /// length ----> property in array

        System.out.println(s1.toUpperCase());

        char[] charArray = s1.toCharArray();
        System.out.println(charArray);

        System.out.println(s1.charAt(2));

        System.out.println(s1.trim());

        System.out.println(s1.substring(2));


    }
}
