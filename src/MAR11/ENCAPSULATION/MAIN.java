package MAR11.ENCAPSULATION;

public class MAIN {
    public static void main(String[] args) {

        EMPLOYEE employee = new EMPLOYEE();
        employee.id = 101;
        System.out.println(employee.id);
        employee.name = "nikhil";
        System.out.println(employee.name);

        ///  but if we make id and name private we will not be modifing the id and name anymore

        ///  SO WE MAKE SOME PUBLIC METHODS , GETTER AND SETTER

    }
}
