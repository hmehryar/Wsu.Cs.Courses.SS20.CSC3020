package csc3020.lecture24.go1277;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

public class Lecture24Source {
    public static void main(String[] args) {
        //Data Access Object Interface: Method's Signature: Interface
        //Data Access Object Implementation: Method's Body: Class
        //Model/Value Object: Class

        //CRUD: Create, Retrieve, Update, Delete
        //Product

        ProductDao oProductDao=new ProductDaoImpl();

        System.out.println("print all products list");
        List<Product> oProducts= oProductDao.getAllProducts();
        for (Product product :oProducts) {
            System.out.println(product);
        }

        System.out.println("Update Product 0");
        Product product=oProductDao.getAllProducts().get(0);
        product.setTitle("Keyboard1");
        product.setPrice(12.0);
        oProductDao.updateProduct(product);

        Product oModifiedProduct= oProductDao.getProduct(0);
        System.out.println(oModifiedProduct);

        System.out.println("Inserting a product");
        Product oNewProduct=new Product(3,"LG Monitor", 120.0);
        oProductDao.insertProduct(oNewProduct);

        oProductDao.getAllProducts().forEach(current->{
            System.out.println(current);
        });

        System.out.println("Deleting a product");
        Product oDeletingProduct=new Product(2);
        oProductDao.deleteProduct(oDeletingProduct);

        oProductDao.getAllProducts().forEach(current->{
            System.out.println(current);
        });

        //Reading from console
        try{
            BufferedReader oBufferedReader=new BufferedReader(new InputStreamReader(System.in));
            String inputFromConsole=null;
            System.out.println("Insert input string in the console:");
            inputFromConsole=oBufferedReader.readLine();
            System.out.println("Input Statement: "+inputFromConsole);
            String[] productSeparated= inputFromConsole.split(",");
             int productId= Integer.parseInt( productSeparated[0]);
            String productTitle=  productSeparated[1];
            double productPrice= Double.parseDouble( productSeparated[2]);
            Product newProduct1=new Product(productId,productTitle,productPrice);
            oProductDao.insertProduct(newProduct1);

        }catch (Exception oException){

        }

    }
}
