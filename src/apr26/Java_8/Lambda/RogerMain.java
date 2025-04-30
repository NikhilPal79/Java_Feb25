package apr26.Java_8.Lambda;

public class RogerMain {
    public static void main(String[] args) {

        ///

        Rogers rogers = new Rogers();
        rogers.job();
        System.out.println();

        /// traditional implementation of interface method

        RogerEmp rogerEmp = new RogerEmp() {
            @Override
            public void Test() {
                System.out.println("i am default method ");
            }
        };


        RogerEmp rogerLambda = () -> System.out.println(" i am method under rogers");

        rogerLambda.Test();


    }
}
