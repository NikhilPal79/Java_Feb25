package MAR15.ASSIGNMENT;

public class MAIN {
    public static void main(String[] args) {

        CREDIT_CARD credit_card = new CREDIT_CARD();
        credit_card.amount = 50.0;
        credit_card.tax = 10.0;
        System.out.println("payment from credit card : " + credit_card.makepayment());

        PAYPAL paypal = new PAYPAL();
        paypal.amount = 50.0;
        paypal.tax = 8.0;
        System.out.println("payment from paypal : " + paypal.makepayment());

        UPI upi = new UPI();
        upi.amount = 50.0;
        upi.tax = 6.0;
        System.out.println("payment from upi : " + upi.makepayment());

        INTERAC interac = new INTERAC();
        interac.amount = 50.0;
        interac.tax = 4.0;
        System.out.println("payment from interac : " + interac.makepayment());
    }
}
