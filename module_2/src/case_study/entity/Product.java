package case_study.entity;

public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;

    public Product() {

    }

    public Product(int id, String name, double price, int quantity) {
        this.id = id;
        this.quantity = quantity;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
        return """
            +--------------------------------------------------+
            |                   PRODUCT INFO                   |
            +--------------------------------------------------+
            | ID       : %-37d |
            | Name     : %-37s |
            | Price    : %-37.2f |
            | Quantity : %-37d |
            +--------------------------------------------------+
            """.formatted(id, name, price, quantity);
    }
}