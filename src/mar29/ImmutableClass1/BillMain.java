package mar29.ImmutableClass1;

public class BillMain {
    public static void main(String[] args) {

        Bills bills = new Bills(6,"hundred fifty","hundred twenty","fifty");
        System.out.println(bills);
        System.out.println();
        System.out.println(bills.getNoOfTenants());
        System.out.println();
        System.out.println(bills.getHydroBill());
        System.out.println();
        System.out.println(bills.getElectricityBill());
        System.out.println();
        System.out.println(bills.getGasBill());
    }
}
