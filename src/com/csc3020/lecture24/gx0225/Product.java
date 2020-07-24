package csc3020.lecture24.gx0225;

public class Product {
    private String title;
    //id is equal to roll number
    private int id;
    private double price;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrice(double price) {
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

    @Override
    public String toString() {
        return "Product{" +
                "title='" + title + '\'' +
                ", id=" + id +
                ", price=" + price +
                '}';
    }

    public Product(int id, String title, double price) {
        this.title = title;
        this.id = id;
        this.price = price;
    }
    public Product(int id) {
        this.id = id;
    }
}
