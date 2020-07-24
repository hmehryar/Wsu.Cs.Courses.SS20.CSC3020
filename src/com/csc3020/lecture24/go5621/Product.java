package com.csc3020.lecture24.go5621;

public class Product {
    private String title;
    //id is equal to roll number
    private int id;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }

    public Product( int id,String title, double price) {
        this.title = title;
        this.id = id;
        this.price = price;
    }

    public Product(int id) {
        this.id = id;
    }
}
