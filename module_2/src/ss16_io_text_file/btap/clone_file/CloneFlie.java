package module_2.src.ss16_io_text_file.btap.clone_file;

import java.io.*;
import java.util.Arrays;

public class CloneFlie {
    public static final String UrlFileSource = "module_2/src/ss16_io_text_file/btap/clone_file/sourceFile.csv";
    public static final String UrlFileTarget = "module_2/src/ss16_io_text_file/btap/clone_file/targetFile.csv";

    public void readFile(String string) {
        File file = new File(string);
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
    public void writeFile() {
        File source = new File(UrlFileSource);
        File target = new File(UrlFileTarget);

        try (
                FileReader fileReader = new FileReader(source);
                FileWriter fileWriter = new FileWriter(target);
                BufferedReader bufferedReader = new BufferedReader(fileReader);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)
        ) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            System.out.println("Đã sao chép file thành công!");

        } catch (IOException e) {
            System.out.println("Lỗi khi sao chép file");
        }
    }

}
