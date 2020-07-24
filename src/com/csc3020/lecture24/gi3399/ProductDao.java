package com.csc3020.lecture24.gi3399;

import java.util.List;

public interface ProductDao {
    public List<Product> getAllProduct();
    public Product getProduct(int id);
    public void updateProduct(Product product);
    public void deleteProduct(Product product);
    public void insertProduct(Product product);

}
