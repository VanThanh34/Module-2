package module_2.src.ss12_java_collection_framework.bai_tap.view;

import module_2.src.ss12_java_collection_framework.bai_tap.entity.Product;

import java.util.Scanner;


public class ProductView {
    public static final Scanner sc = new Scanner(System.in);
    public static Product addProduct() {
        System.out.print("Nhập ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        double price = Double.parseDouble(sc.nextLine());
        return new Product(id, name, price);
    }

    public static void updateProduct(Product product) {
        System.out.print("Nhập tên mới: ");
        String name = sc.nextLine();
        product.setName(name);
        System.out.print("Nhập giá mới: ");
        double price = Double.parseDouble(sc.nextLine());
        product.setPrice(price);
    }

    public static int inputId(){
        System.out.print("nhập id cần tìm: ");
        int id = sc.nextInt();
        sc.nextLine();
        return  id;
    }
//    public boolean deleteProduct(int id) {
//        int index = findIndexById(id);
//        if (index != -1) {
//            repository.getProducts().remove(index);
//            return true;
//        }
//        return false;
//    }

//    public List<Product> getAllProducts() {
//        return repository.getProducts();
//    }
//
//    public Product searchById(int id) {
//        for (Product p : repository.getProducts()) {
//            if (p.getId() == id) {
//                return p;
//            }
//        }
//        return null;
//    }
//
//    public void sortByPriceAscending() {
//        repository.getProducts().sort(Comparator.comparingDouble(Product::getPrice));
//    }
//
//    public void sortByPriceDescending() {
//        repository.getProducts().sort((a, b) -> Double.compare(b.getPrice(), a.getPrice()));
//    }
//
//    public int findIndexById(int id) {
//        List<Product> products = repository.getProducts();
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getId() == id) {
//                return i;
//            }
//        }
//        return -1;
//    }
}
