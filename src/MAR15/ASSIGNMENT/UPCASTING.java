package MAR15.ASSIGNMENT;

public class UPCASTING {
    public static void main(String[] args) {


        ///  all should be assigned to payment(PARENT) class

        PAYMENT credit_card = new CREDIT_CARD();
        System.out.println("payment from credit card : " + credit_card.makepayment());

        PAYMENT paypal = new PAYPAL();
        System.out.println("payment from paypal : " + paypal.makepayment());

        PAYMENT upi = new UPI();
        System.out.println("payment from upi : " + upi.makepayment());

        PAYMENT interac = new INTERAC();
        System.out.println("payment from interac: " + interac.makepayment());


    }


}



