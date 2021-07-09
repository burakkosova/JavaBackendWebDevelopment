package dev.patika;

public class Product {
    private int id;
    private double price;
    private double discount;
    private int stockAmount;
    private String name;
    private Brand brand;
    private static int count=0;

    public Product(double price, double discount, int stockAmount, String name, Brand brand) {
        this.id = ++count;
        this.price = price;
        this.discount = discount;
        this.stockAmount = stockAmount;
        this.name = name;
        this.brand = brand;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
