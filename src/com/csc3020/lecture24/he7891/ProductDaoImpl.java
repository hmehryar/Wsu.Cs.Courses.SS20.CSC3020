package csc3020.lecture24.he7891;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {

    // List of product
    List<Product> products;

    public ProductDaoImpl() {
        products = new ArrayList<>();
        Product oProduct1 = new Product(1, "Keyboard", 10.5);
        Product oProduct2 = new Product(2, "Mouse", 5.0);
        Product oProduct3 = new Product(3, "Monitor", 100.2);
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
    public void updateProduct(Product oProduct) {
        products.get(oProduct.getId()).setPrice(oProduct.getPrice());
        products.get(oProduct.getId()).setTitle(oProduct.getTitle());
        System.out.println(oProduct);
        System.out.println("Product has been modified: " + oProduct);


    }

    @Override
    public void deleteProduct(Product oProduct) {
        products.remove(oProduct.getId());
        System.out.println("Product has been deleted: " + oProduct);
    }

    @Override
    public void insertProduct(Product oProduct) {
        products.add(oProduct);
        System.out.println("Product has been inserted: " + oProduct);
    }
}
