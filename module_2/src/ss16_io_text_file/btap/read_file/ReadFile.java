package module_2.src.ss16_io_text_file.btap.read_file;

import java.io.*;
import java.util.Arrays;

public class ReadFile {
    public void readFile() {
        File file = new File("module_2/src/ss16_io_text_file/btap/read_file/Country.csv");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            System.out.println("Đây là Danh sách: ");
            while ((line = bufferedReader.readLine()) != null) {
                String[] temp = line.split(",");
                System.out.println(Arrays.toString(temp));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy File!");
        } catch (IOException e) {
            System.out.println("Lỗi đọc File!");
        }
    }
}
