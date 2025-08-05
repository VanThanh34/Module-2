package case_study.entity;

public record CartItem(Product product, int quantity) {

    public double getTotalPrice() {
        return product.getPrice() * quantity;
    }
}
