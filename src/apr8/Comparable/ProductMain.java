package apr8.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductMain {
    public static void main(String[] args) {

        List<Product> productList = new ArrayList<>();

        productList.add( new Product(5072, "honda","touring"));
        productList.add( new Product(2122, "hyundai","sonata"));
        productList.add( new Product(7544, "toyota","sports"));
        productList.add( new Product(5565, "dodge","dorango"));

        System.out.println(productList);
        System.out.println();

        Collections.sort(productList);
        System.out.println(productList);
    }
}
