package MAR4;

public class STRING {
    public static void main(String[] args) {



        String s1 = "apple";
        String s2 = "orange ";
        String s3 = "apple";
        String s4 = new String("apple");

        ///  == -----> compare reference
        ///  equals -----> content compare

        System.out.println(s1== s2);
        System.out.println(s1.equals(s4));
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s2.equals(s4));
    /*



     */
    }
}
