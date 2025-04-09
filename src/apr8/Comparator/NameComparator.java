package apr8.Comparator;

import org.jetbrains.annotations.NotNull;

public class NameComparator implements Comparable<BankClass> {



    @Override
    public int compare(@NotNull BankClass b1 , BankClass b2) {
        return b1.getAccountHolderName().compareTo(b2.getAccountHolderName());
        //m1.getBrand().compareTo(m2.getBrand());
    }
}
