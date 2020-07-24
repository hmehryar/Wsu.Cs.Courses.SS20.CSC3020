package csc3020.lecture24.gn2289;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.function.DoublePredicate;

public class Lecture24Source {
    public static void main(String[] args) {
         //CRUD create, retrieve, update, delete
        //product
        ProductDao oProductDao = new ProductDaoImpl();

        //print them all
        System.out.println("Print all products");

        List<Product> oProducts = oProductDao.getAllProducts();

        for(Product product: oProducts) {
            System.out.println(product);
        }

        System.out.println("Update product 0");

        Product product = oProductDao.getAllProducts().get(0);
        product.setTitle("Keyboard1");
        product.setPrice(12.0);
        oProductDao.updateProduct(product);

        Product oModifiedProduct = oProductDao.getProduct(0);
        System.out.println(oModifiedProduct);

        System.out.println("Inserting a product...");
        Product newProduct = new Product(4,"LG Monitor", 120.0);
        oProductDao.insertProduct(newProduct);

        oProductDao.getAllProducts().forEach(current -> {
            System.out.println(current);
        });

        System.out.println("Deleting a product");
        Product deletingProduct = new Product(2);
        oProductDao.deleteProduct(deletingProduct);

        oProductDao.getAllProducts().forEach(current -> {
            System.out.println(current);
        });

        //reading from console
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputFromConsole = null;
            inputFromConsole = bufferedReader.readLine();
            System.out.println("Input Statement: "+inputFromConsole);
            String[] productSplitted = inputFromConsole.split(",");
            int productId = Integer.parseInt(productSplitted[0]);
            String productTitle = productSplitted[1];
            double productPrice = Double.parseDouble(productSplitted[2]);
            Product newProduct1 = new Product(productId, productTitle, productPrice);
            oProductDao.insertProduct(newProduct1);
        }catch (Exception exception) {
            System.out.println("error");
        }
    }
}
