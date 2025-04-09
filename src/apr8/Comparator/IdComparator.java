package apr8.Comparator;

import java.util.Comparator;

public class IdComparator implements Comparator<BankClass> {

    @Override
    public int compare(BankClass o1, BankClass o2) {
        return Integer.compare(o1.getAccountId(), o2.getAccountId());
    }
}
