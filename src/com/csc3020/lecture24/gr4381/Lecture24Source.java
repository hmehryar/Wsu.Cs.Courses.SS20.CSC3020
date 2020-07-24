package csc3020.lecture24.gr4381;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Lecture24Source {
    public static void main(String[] args) {
        // Data Access Object interface: Method Signature: Interface
        // Data Access Object Implementation: Method Body: Class
        // Model/Value Object: Class

        // CRUD: Create, Retrieve, Update, Delete
        // Product

        ProductDao oProductDao = new ProductDaoImpl();
        List<Product> oProducts = oProductDao.getAllProducts();

        System.out.println("Print all products:");
        for (Product product:oProducts) {
            System.out.println(product);
        }

        System.out.println("Update product 0:");
        Product product = oProductDao.getAllProducts().get(0);
        product.setTitle("Keyboard1");
        product.setPrice(12.0);
        oProductDao.updateProduct(product);

        Product oModifiedProduct = oProductDao.getProduct(0);
        System.out.println(oModifiedProduct);

        System.out.println("Inserting a product:");
        Product oNewProduct = new Product(3, "LG Monitor", 120.00);
        oProductDao.insertProduct(oNewProduct);

        oProductDao.getAllProducts().forEach(current -> {
            System.out.println(current);
        });

        System.out.println("Deleting a product:");
        Product oDeletingProduct = new Product(2);
        oProductDao.deleteProduct(oDeletingProduct);
        oProductDao.getAllProducts().forEach(current -> {
            System.out.println(current);
        });

        // Console input
        try{
            BufferedReader oBufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String inputFromConsole = null;
            System.out.println("Enter a line in the console: ");
            inputFromConsole = oBufferedReader.readLine();
            String[] productSplit = inputFromConsole.split(",");
            int productId = Integer.parseInt(productSplit[0]);
            String productTitle = productSplit[1];
            double productPrice = Double.parseDouble(productSplit[2]);
            Product newProduct1 = new Product(productId, productTitle, productPrice);
            oProductDao.insertProduct(newProduct1);
            System.out.println("Input Statement: " + inputFromConsole);

        }catch (Exception oException){

        }
        oProductDao.getAllProducts().forEach(current -> {
            System.out.println(current);
        });
    }
}
