package csc3020.lecture24.gg6997;

import csc3020.lecture24.gg6997.Product;
import csc3020.lecture24.gg6997.ProductDao;

import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl implements ProductDao {
    //list of product
    List<csc3020.lecture24.gg6997.Product> products;

    public ProductDaoImpl() {
        products=new ArrayList<>();
        csc3020.lecture24.gg6997.Product oProduct1=new csc3020.lecture24.gg6997.Product(0,"Keyboard",10.5);
        csc3020.lecture24.gg6997.Product oProduct2=new csc3020.lecture24.gg6997.Product(1,"Mouse",5.6);
        csc3020.lecture24.gg6997.Product oProduct3=new csc3020.lecture24.gg6997.Product(2,"Monitor",100.2);
        products.add(oProduct1);
        products.add(oProduct2);
        products.add(oProduct3);
    }

    @Override
    public List<csc3020.lecture24.gg6997.Product> getAllProducts() {
        return products;
    }

    @Override
    public csc3020.lecture24.gg6997.Product getProduct(int id) {
//        for (Product current:products) {
//            if (current.getId()==id) {
//                return current;
//            }
//        }
        return products.get(id);
    }

    @Override
    public void updateProduct(csc3020.lecture24.gg6997.Product product) {
        products.get(product.getId()).setPrice(product.getPrice());
        products.get(product.getId()).setTitle(product.getTitle());
        System.out.println("Product has been modified: "+product);
    }

    @Override
    public void deleteProduct(csc3020.lecture24.gg6997.Product product) {
        products.remove(product.getId());
        System.out.println("Product has been deleted: "+product);
    }

    @Override
    public void insertProduct(Product product) {
        products.add(product);
        System.out.println("Product has been inserted: "+product);
    }

}
