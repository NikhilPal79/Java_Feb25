package MAR15.ABSTRACTION;

public abstract class CAR {


        // it can contain abstract and non-abstract methods

        // abstract methods does not have body
        /// creating abstract method
        public abstract void run();

        ///  creating concrete method

       /* public void brake(){
            System.out.println("car stops ");
        }
    */
        public abstract void brake();

        public abstract void windows();

        ///  NOTE ==> WHY WE USE METHODS WITHOUT BODY ??


    }
}
