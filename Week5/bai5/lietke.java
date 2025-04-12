package bai5;

import java.io.*;

public class lietke {
    public static void main(String[] args) {
        String directoryPath = "D://"; // Thư mục cần liệt kê

        File directory = new File(directoryPath);

        if (directory.exists() && directory.isDirectory()) {
            File[] files = directory.listFiles();
            if (files != null) {
                System.out.println("Danh sách các file trong thư mục " + directoryPath + ":");
                for (File file : files) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("Không thể lấy danh sách file trong thư mục.");
            }
        } else {
            System.out.println("Thư mục không tồn tại hoặc không hợp lệ.");
        }
    }
}
