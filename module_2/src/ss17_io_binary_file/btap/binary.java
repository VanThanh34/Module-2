package ss17_io_binary_file.btap;

import java.io.*;

public class binary{
    public static void main(String[] args) {
        Product product1 = new Product(1,"Quạt", 23.5, "Vietnam", "còn hàng");
        Product product2 = new Product(2,"Quạt lạnh", 43.5, "Vietnam", "hết hàng");
        File file = new File("src/ss17_io_binary_file/btap/product.dat");
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream)){
            oos.writeObject(product1);
            oos.writeObject(product2);
            System.out.println("da ghi file thanh cong!");
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy file");
        } catch (IOException e) {
            System.out.println("Lỗi ghi file");
        }
        try( FileInputStream fileInputStream = new FileInputStream(file);
             ObjectInputStream ois = new ObjectInputStream(fileInputStream)) {
            while (true) {
                try {
                    Product product = (Product) ois.readObject();
                    System.out.println("Đã đọc: " + product);
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Khong tim thay file");
        } catch (IOException e) {
            System.out.println("Loi doc file");
        } catch (ClassNotFoundException e) {
            System.out.println("Khong co lop nao");
        }
    }
}
