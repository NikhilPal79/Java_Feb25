package apr8.Comparator;

import java.util.Comparator;

public class BalanceComparator implements Comparator<BankClass> {

    @Override
    public int compare(BankClass b1, BankClass b2) {
        return b1.getAccountBalance().compareTo(b2.getAccountBalance());

    }
}
