package MAR15.ABSTRACTION;

public class MAIN {
    public static void main(String[] args) {


        ///  NOTE ===> CAN NOT CREATE THE OBJECT OF CAR CLASS

        /* CAR car = new CAR();*/

        HONDACIVIC hondacivic = new HONDACIVIC();

        /// call the method
        hondacivic.brake();

        hondacivic.run();

        hondacivic.windows();
    }
}
