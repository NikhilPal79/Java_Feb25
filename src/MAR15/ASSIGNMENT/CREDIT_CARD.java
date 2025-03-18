package MAR15.ASSIGNMENT;

public class CREDIT_CARD extends PAYMENT{

    double amount;
    double tax ;

    ///  creating method
    @Override
    public double makepayment() {
        return amount - tax;
    }
}
