package FEB22;

public class Computer {

    //CONSTRUCTOR ====> KIND OF METHOD WHICH HAS SAME NAME AS CLASS NAME WHICH INITIALIZE THE OBJECT.
    // IT DOES NOT HAVE RETURN TYPE, NOT EVEN VOID.
    /*
    2 TYPE OF CONSTRUCTORS
    A = DEFAULT
    B = PARAMETERIZED

     */

    // member class    ======> with 2 member class we can only create 3 constructor, default, only with one parameter, both parameters.

    int memory;
    String brand;

    // DEFAULT CONSTRUCTOR SYNTAX =====> Class_name(){
    // }

    Computer(){

    }

    // PARAMETERIZED CONSTRUCTOR
    // SYNTAX ==================> CLASS_NAME(int a, int b, ){
    // }


    public Computer(int memory) {         // =========> CONSTRUCTOR MADE BY INTELLJ COMMANDS
        this.memory = memory;
    }

    Computer(int memory, String brand){
        this.memory = memory;
        this.brand = brand;
    }

    public static void main(String[] args) {
        Computer computer = new Computer(250,"asus");   // CREATING THE OBJECT ==========> ASSIGNING CONSTRUCTOR TO VARIABLE LIKE
        // INT X          = 10;

        // new Computer(); ========================> CALLING THE CONSTRUCTOR

        System.out.println(computer.brand);  // giving default values

        System.out.println(computer.memory); // giving default values

        computer.brand = "dell";
        System.out.println(computer.brand);

    }

    /*
    NOTE ==== IF WE DONT HAVE ANY CONSTRUCTOR, CLASS AUTOMATICALLY CREATE DEFAULT CONSTRUCTORS
    =====> IF WE CREATE THE CONSTRUCTOR, THEN THEIR WILL BE NO DEFAULT CONSTRUCTOR
     */


}
