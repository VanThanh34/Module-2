package case_study.entity;

public class CartItem {

    private final Product product;
    private final int quantity;

    public CartItem( Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
    @Override
    public String toString() {
        return product.getName() + " | Số lượng: " + quantity + " | Tổng: " + getTotalPrice() + " VND";
    }
}
