package csc3020.lecture24.gx0225;

import java.util.List;

public interface ProductDao {
    public List<Product> getAllProducts();
    public Product getProduct(int id);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);
    public void insertProduct(Product product);
}
