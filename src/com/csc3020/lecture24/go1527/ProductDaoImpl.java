package csc3020.lecture24.go1527;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao{
    //List of products
    List<Product> products;

    public ProductDaoImpl() {
        products = new ArrayList<>();
        Product oProduct1 = new Product(0,"keyboard",10.5);
        Product oProduct2 = new Product(1,"Mouse",5.6);
        Product oProduct3 = new Product(2,"Monitor",100.2);
        products.add(oProduct1);
        products.add(oProduct2);
        products.add(oProduct3);
    }

    @Override
    public List<Product> getAllProducts() {
        return products;
    }

    @Override
    public Product getProduct(int id) {
//        for (Product current : products) {
//            if (current.getId() == id) {
//                return current;
//            }
//        }

        return products.get(id);
    }

    @Override
    public void updateProduct(Product product) {
        products.get(product.getId()).setPrice(product.getPrice());
        products.get(product.getId()).setTitle(product.getTitle());
        System.out.println("Product has been deleted: "+product);
    }

    @Override
    public void deleteProduct(Product product) {
        products.remove(product.getId());
        System.out.println("Product has been deleted: "+product);

    }

    @Override
    public void insertProduct(Product product) {
        products.add(product);
        System.out.println("Product has been inserted: "+product);
    }

}