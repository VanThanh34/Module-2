package case_study.service;


import case_study.entity.CartItem;
import case_study.entity.Customer;
import case_study.entity.Product;
import case_study.repository.ProductRepository;


import java.util.List;

public class ProductService implements IProductService{
    public static ProductRepository repository = new ProductRepository();
    private static ProductService instance;


    private ProductService() {
    }

    public static synchronized ProductService getInstance(){
        if(instance == null){
            instance = new ProductService();
        }
        return instance;
    }

    public static boolean checkout() {
        return repository.checkout();
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll();
    }

    @Override
    public void add(Product product) {
    repository.add(product);
    }

    @Override
    public boolean delete(int id) {
        return repository.delete(id);
    }

    @Override
    public Product searchById(int id) {
        return repository.searchById(id);
    }

    @Override
    public void updateById(int id, Product product) {
        repository.updateById(id, product);
    }
    public String buyProduct(int id, int quantity){
        return repository.buyProduct(id,quantity);
    }

    public String addToCart(int id, int quantity) {
        return repository.addToCart(id,quantity);
    }

    public static List<CartItem> getCart() {
        return repository.getCart();
    }

    public void infoProduct(int id) {
        repository.infoProduct(id);
    }

    public String changeFromCart(int idDeleteCart, int quantityProductDelete) {
        return repository.changeFromCart(idDeleteCart, quantityProductDelete);
    }
    public String infoProductInCart(int id){
        return repository.infoProductInCart(id);
    }

    public void addInfoCustommer(String name, String phone) {
        repository.addInfoCustommer(name, phone);
    }

    public List<Customer> showCustomer() {
        return repository.showCustomer();
    }
}
