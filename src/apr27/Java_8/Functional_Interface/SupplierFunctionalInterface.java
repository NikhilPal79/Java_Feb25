package apr27.Java_8.Functional_Interface;

import java.util.function.Supplier;

public class SupplierFunctionalInterface {
    public static void main(String[] args) {

        Supplier<String> stringSupplier = () ->{
            String[] s1 ={"nik","mak","sam","ven","ram","ina"};
            int x =(int)(Math.random()*5+1);
            return s1[x];
        };


        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());
        System.out.println(stringSupplier.get());


    }
}
