package ss12_java_collection_framework.bai_tap.entity;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product() {
    }


    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return String.format("| ID: %-4d | Tên: %-10s | Giá: %,.2f VND |", id, name, price);
    }
}
