package apr8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {


        List<BankClass> bankClassList = new ArrayList<>();

        bankClassList.add(new BankClass(5072,"nikhil",3616.00));
        bankClassList.add(new BankClass(2122,"karan",6416.00));
        bankClassList.add(new BankClass(6486,"ajay",9416.00));
        bankClassList.add(new BankClass(5565,"ram",5616.00));


        System.out.println("insertion order : "+bankClassList);
        System.out.println();

        Collections.sort(bankClassList, new NameComparator());

        System.out.println("sorted order by name : "+bankClassList);
        System.out.println();

        Collections.sort(bankClassList, new BalanceComparator());


        System.out.println("sorted order by balance : "+bankClassList);
        System.out.println();

        ///  sort on the basis of accountId ?

        Collections.sort(bankClassList, new IdComparator());

        System.out.println("sorted order by accountId: "+bankClassList);


    }
}
