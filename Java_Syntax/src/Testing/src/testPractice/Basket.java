package testPractice;

import java.util.List;

public interface Basket {
    void addProduct(String product, int quantity);
    void removeProductQuantity(String product, int quantity);
    void updateProductQuantity(String product, int quantity);
    void clear();
    List<String> getProducts();
    int getProductQuantity(String product);
}
