package ss17_io_binary_file.btap;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double price;
    private String origin;
    private String description;
    public Product(){

    }

    public Product(int id, String name, double price, String origin, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.origin = origin;
        this.description = description;
    }

    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String isDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
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
        return "Product{" +
                "id=" + id +
                ", name= '" + name + '\'' +
                ", price= " + price +
                ", origin= '" + origin + '\'' +
                ", description= " + description +
                '}';
    }
}
