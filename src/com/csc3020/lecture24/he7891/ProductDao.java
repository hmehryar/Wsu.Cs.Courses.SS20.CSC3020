package csc3020.lecture24.he7891;

import java.util.List;

public interface ProductDao {
    public List<Product> getAllProducts();
    public Product getProduct(int id);
    public void updateProduct(Product oProduct);
    public void deleteProduct(Product oProduct);
    public void insertProduct(Product oProduct);
}
