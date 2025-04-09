package apr8.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {


        Product product1 = new Product(5072,"apple","smartphone");
        Product product2 = new Product(2122,"samsung","androidPhone");
        Product product3 = new Product(1097,"tesla","car");
        Product product4 = new Product(6846,"playStation","entertainment");
        Product product5 = new Product(5565,"tV","LED");


        List<Product> productList = new ArrayList<>();

        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);

        System.out.println("before sorting " + productList);

        Collections.sort(productList);

        System.out.println("after sorting " + productList);

        /*productList.sort(Comparator.comparing(Product::getName));*/

        productList.sort(Comparator.comparing(Product::getProductName));

        System.out.println("after sorting on productNameBasis :" + productList);

        productList.sort(Comparator.comparing(Product:: getDescription));

        System.out.println("after sorting on getDescription :" + productList);

        /*Collections.sort();*/








    }
}
