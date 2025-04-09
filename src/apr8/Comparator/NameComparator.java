package apr8.Comparator;

import org.jetbrains.annotations.NotNull;

import java.util.Comparator;

public class NameComparator implements Comparator<BankClass> {

    @Override
    public int compare(BankClass b1, BankClass b2) {
        return b1.getAccountHolderName().compareTo(b2.getAccountHolderName());
    }
}


        /*BankClass b1, BankClass b2, BankClass b3, BankClass b4


b1.getAccountHolderName().compareTo(b2.getAccountHolderName())*/