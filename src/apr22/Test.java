package apr22;

public class Test {
    public static void main(String[] args) {


        String s1 = new String("nikhil");
        String s2 = new String("nikhil");

        StringBuffer sb1 = new StringBuffer("nikhil");
        StringBuffer sb2 = new StringBuffer("nikhil");

        System.out.println(s1 == s2); /// comparing reference
        System.out.println(s1.equals(s2));
        System.out.println(sb1 == sb2);
        System.out.println(sb1.equals(sb2));


        /// System.out.println(sb1 == s1); /// compile time error ===> incomparable error
        System.out.println(s1.equals(sb1));

    }
}
