package apr8.Comparator;

import org.jetbrains.annotations.NotNull;

public class Product implements Comparable<Product> {

    int productId;
    String productName;
    String description;

    public Product(int productId, String productName, String description) {
        this.productId = productId;
        this.productName = productName;
        this.description = description;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", description='" + description + '\'' +
                '}';
    }



    @Override
    public int compareTo(@NotNull Product o) {
        return Integer.compare(this.productId , o.productId);
    }


}
