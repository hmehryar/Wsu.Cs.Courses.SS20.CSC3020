package csc3020.lecture24.hc7391;

public class Product {
    private String title;
    //equal is equal to roll number
    private int id;
    private  double price;

    public Product(int id, String title, double price) {
        this.title = title;
        this.id = id;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Package{ id = " + id +
                " title = '" + title + '\'' +
                ", price = " + price +
                '}';
    }

    public Product(int id) {
        this.id = id;
    }
}
