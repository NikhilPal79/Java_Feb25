package MAR18.INTERFACE2;

public class MAIN {
    public static void main(String[] args) {

        Samsung samsung = new Samsung();
        samsung.makeCalculation();
        samsung.clickPictures();
        samsung.showTime();
        samsung.internetOperator();
        samsung.musicPlayer();
        System.out.println();

        Iphone15 iphone15 = new Iphone15();
        iphone15.appleProduct();
        iphone15.makeCalculation();
        iphone15.clickPictures();
        iphone15.showTime();
        iphone15.internetOperator();
        iphone15.musicPlayer();
        System.out.println();

        Iphone16 iphone16 = new Iphone16();
        iphone16.appleProduct();
        iphone15.makeCalculation();
        iphone15.clickPictures();
        iphone15.showTime();
        iphone15.internetOperator();
        iphone15.musicPlayer();

        ///  cant inherit interface class from interface class

        ///  NOTE ** ==INTERFACE IS A CONTRACT WHICH

        ///  NOTE

        ///  CLASS(child)     ==========EXTENDS==============>    CLASS(parent)

        ///  INTERFACE(child) ==========EXTENDS==============>    INTERFACE(parent)

        ///  CLASS(child)     ==========IMPLEMENT=============>  INTERFACE(parent)


        ///  INTERFACE(child)     ==========NOOOO=============>   CLASS(parent)


        ///  CLASS(child) ==========> EXTENDS CLASS(PARENT), IMPLEMENTS INTERFACE(PARENT)


    }
}
