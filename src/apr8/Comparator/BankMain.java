package apr8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BankMain {
    public static void main(String[] args) {


        BankClass bankClass1 = new BankClass(5072,"nikhil",3616.00);
        BankClass bankClass2 = new BankClass(2122,"karan",6416.00);
        BankClass bankClass3 = new BankClass(6486,"ajay",9416.00);
        BankClass bankClass4 = new BankClass(5565,"ram",5616.00);


        List<BankClass> bankClassList = new ArrayList<>();

        bankClassList.add(bankClass1);
        bankClassList.add(bankClass2);
        bankClassList.add(bankClass3);
        bankClassList.add(bankClass4);


        System.out.println(bankClassList);

        Collections.sort(bankClassList, new NameComparator());
    }
}
