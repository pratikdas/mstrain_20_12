package com.train.catalogSearch;

public class Product {

    public Product() {
    }

    public Product(String title, String category) {
        this.title = title;
        this.category = category;
    }

    private String title;
    private String category;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
