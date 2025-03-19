package MAR15.ASSIGNMENT;

public class INTERAC extends PAYMENT{

    double amount;
    double tax;

    @Override
    public double makepayment() {
        return amount - tax;
    }
}
