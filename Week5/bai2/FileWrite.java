package bai2;

import java.io.*;

public class FileWrite {
    public static void main(String[] args) {
        String destinationFile = "D://ThucHanhCode//HocJava//Week5//bai2//out.txt/"; // Đường dẫn file đích

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileWriter writer = new FileWriter(destinationFile)) {

            System.out.println("Nhập nội dung cần lưu vào file (Nhập 'exit' để kết thúc):");
            String line;
            while (!(line = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(line + "\n");
            }

            System.out.println("Dữ liệu đã được ghi vào file thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
