package case_study.repository;

import case_study.entity.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository{
    private final static List<Product> products = new ArrayList<>();
    private static final String UrlFileData = "src/case_study/data/Product.csv";
    @Override
    public List<Product> findAll() {
        File file = new File(UrlFileData);
        products.clear();
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while((line = bufferedReader.readLine())!=null){
                String [] temp = line.trim().split(",");
                Product product = new Product(Integer.parseInt(temp[0]),Integer.parseInt(temp[1]),Double.parseDouble(temp[2]),temp[3]);
                products.add(product);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy File!");
        } catch (IOException e) {
            System.out.println("Lỗi đọc File!");
        }
        System.out.println("Đang đọc file: " + file.getAbsolutePath());
        return new ArrayList<>(products);
    }

    @Override
    public void add(Product product) {
    products.add(product);
    File file = new File(UrlFileData);

        try(FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(productToString(product));
            bufferedWriter.newLine();
            System.out.println("Đã thêm sản phẩm thành công!");
            System.out.println("============================");
        } catch (IOException e) {
            System.out.println("Lỗi ghi thông tin: " + e.getMessage());
        }

    }
    private String productToString(Product product) {
        return product.getId() + ","+product.getQuantity()+ "," + product.getPrice()+ "," + product.getName();
    }
    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public Product searchById(int id) {
        for (Product p : findAll()) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
    @Override
    public void updateById(int id, Product product) {
    List<Product> productList = findAll();
    boolean found = false;
        for (int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getId()==id){
                productList.set(i, product);
                found = true;
                break;
            }
        }
        if(found){
            overwriteFile(productList);
        }else{
            System.out.println("Không tìm thấy sản phẩm để cập nhật");
        }
    }
    private void overwriteFile(List<Product> productList){
        File file = new File(UrlFileData);
        try (FileWriter fileWriter = new FileWriter(file);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            for (Product product : productList) {
                bufferedWriter.write(productToString(product));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi đè File.");
        }
    }
}
