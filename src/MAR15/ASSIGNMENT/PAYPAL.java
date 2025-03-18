package MAR15.ASSIGNMENT;

public class PAYPAL extends PAYMENT{

    double amount;
    double tax;

    @Override
    public double makepayment() {
        return amount - tax;
    }
}
