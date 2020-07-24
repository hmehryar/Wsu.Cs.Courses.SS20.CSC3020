package csc3020.lecture24.gg6997;

import csc3020.lecture24.gg6997.Product;

import java.util.List;

public interface ProductDao {
    public List<csc3020.lecture24.gg6997.Product> getAllProducts();
    public csc3020.lecture24.gg6997.Product getProduct(int id);
    public void updateProduct(csc3020.lecture24.gg6997.Product product);
    public void deleteProduct(csc3020.lecture24.gg6997.Product product);
    public void insertProduct(Product product);
}
