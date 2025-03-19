package MAR1.STATIC;

public class EMPLOYE_ASSIGN {


    // CREATING INSTANCE
    int id;
    String name;
    static String company = "ROGERS";  // MAKING COMPANY STATIC VARIABLE

    // GENERATING CONSTRUCTOR
    public EMPLOYE_ASSIGN(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // CREATING EMPDETAILS METHOD
    public void Empdetials(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(company);
    }

    public static void main(String[] args) {

        // CREATING OBJECT FOR DIFFERENT EMP
        EMPLOYE_ASSIGN employeAssign1 = new EMPLOYE_ASSIGN(5072, "nikhil");
        EMPLOYE_ASSIGN employeAssign2 = new EMPLOYE_ASSIGN(5655, "ram");
        EMPLOYE_ASSIGN employeAssign3 = new EMPLOYE_ASSIGN(2122, "karan");
        EMPLOYE_ASSIGN employeAssign4 = new EMPLOYE_ASSIGN(6846, "ajay");

        // CALLING DIFFERENT EMP_DETAILS
        employeAssign1.Empdetials();
        System.out.println();            // FOR MAKE A SPACE IN OUTPUT
        employeAssign2.Empdetials();
        System.out.println();
        employeAssign3.Empdetials();
        System.out.println();
        employeAssign4.Empdetials();


    }


}
