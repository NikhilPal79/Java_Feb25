package apr26.Java_8.ConstructorReference;

public class RogerMain {
    public static void main(String[] args) {


        /// implement the interface

        RogerInter rogerInter = ()->{
          return  new Roger();
        };

        Roger roger = rogerInter.m();
        roger.RogerEmp();


        /// using constructor ref

        RogerInter rogerInter1 = Roger::new;

        Roger roger1 = rogerInter.m();

        /// method only be called after
        roger1.RogerEmp();
    }
}
