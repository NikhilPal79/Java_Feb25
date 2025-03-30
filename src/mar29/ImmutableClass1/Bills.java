package mar29.ImmutableClass1;

import java.util.Objects;

public final class Bills {

    private final int noOfTenants;
    private final String hydroBill;
    private final String electricityBill;
    private final String gasBill;


    public Bills(int noOfTenants, String hydroBill, String electricityBill, String gasBill) {
        this.noOfTenants = noOfTenants;
        this.hydroBill = hydroBill;
        this.electricityBill = electricityBill;
        this.gasBill = gasBill;
    }

    public int getNoOfTenants() {
        return noOfTenants;
    }

    public String getHydroBill() {
        return hydroBill;
    }

    public String getElectricityBill() {
        return electricityBill;
    }

    public String getGasBill() {
        return gasBill;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Bills bills = (Bills) o;
        return noOfTenants == bills.noOfTenants && Objects.equals(hydroBill, bills.hydroBill) && Objects.equals(electricityBill, bills.electricityBill) && Objects.equals(gasBill, bills.gasBill);
    }

    @Override
    public int hashCode() {
        return Objects.hash(noOfTenants, hydroBill, electricityBill, gasBill);
    }

    @Override
    public String toString() {
        return "Bills{" +
                "noOfTenants=" + noOfTenants +
                ", hydroBill='" + hydroBill + '\'' +
                ", electricityBill='" + electricityBill + '\'' +
                ", gasBill='" + gasBill + '\'' +
                '}';
    }
}
