package apr27.Java_8.Functional_Interface;

@FunctionalInterface
interface  Alpha{

    void show(); /// only contain one functional method


}



public class Demo {

    ///  FUNCTIONAL INTERFACE
    // which only contain one function


    public static void main(String[] args) {


        Alpha alpha = () -> {
            System.out.println("learning functional interface which have only one method ");
            System.out.println("by creating lambda expression");
        };

        alpha.show();


    }
}
