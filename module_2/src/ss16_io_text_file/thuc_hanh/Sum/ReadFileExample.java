package module_2.src.ss16_io_text_file.thuc_hanh.Sum;

import java.io.*;

public class ReadFileExample {
    public void readFileText(String filePath) {
        File file = new File(filePath);
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)
            ){
            String line;
            int sum = 0;
            while ((line = bufferedReader.readLine()) != null){
                System.out.println(line);
                sum +=Integer.parseInt(line);
            }
            System.out.println("Tổng là: " + sum);
        }catch (NumberFormatException e) {
            System.out.println("File có chứa nội dung không phải số!");
        }
        catch (FileNotFoundException e) {
            System.out.println("File không tồn tại!");
        }
        catch(IOException e){
            System.out.println("File có nội dung bị lỗi!");
        }
    }
}
