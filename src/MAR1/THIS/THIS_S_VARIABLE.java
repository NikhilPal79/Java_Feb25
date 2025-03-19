package MAR1.THIS;

public class THIS_S_VARIABLE {


    // instance variables which used in method          (also known as global variable)

    // CONSTRUCTOR INITIALIZE THE INSTANCE VARIABLE

     int id;
     String name;

    public THIS_S_VARIABLE(int id, String name) {
        this.id = id;
        this.name = name;                         // this refers to current class variables.
    }

    public void show(int x, int y ){

        // x and y are local variable
        String name;                              // also local variable(those not used in methods)

    }

    /*

    /// 3 TYPE OF VARIABLE


    1. LOCAL VARIABLE

    LOCAL TO METHOD OR CONSTRUCTOR ETC (above example )

    2. INSTANCE VARIABLE

    INSIDE THE CLASS BUT OUTSIDE OF THE METHOD OR A CONSTRUCTOR

    class A{
    int x;

    }

    3. STATIC VARIABLE

    static int x = 10;


    STATIC VARIABLE BELONGS TO CLASS RATHER THAN THE INSTANCE OF A CLASS


    2 TYPE OF MEMORY TYPE  ======>       STACK AND HEAP

    1. STACK     (LIKE A OPEN BUCKET ) === A DATA STRUCTURE

    ---> FIRST IN LAST OUT
    ====> STORED LOCAL VARIABLE



    ======> reference stored in stack ====>Student s




    2. HEAP ()

    ====> ALL OBJECT STORED IN HEAP


    LETS TAKE AN EXAMPLE WITH OBJECT STUDENT
    Student s = new Student (101, "nikhil")
    ====> stored in heap =======>new Student (101, "nikhil")

     */


    /*

    WE NEED TO LEARN 4 THINGS UNDER STATIC

    // VARIABLE
    // METHOD
    // CLASS
    // BLO

     */




}
