package bai4;

import java.io.*;

public class ghidocsonguyen {
    public static void main(String[] args) {
        String filePath = "D://ThucHanhCode//HocJava//Week5//bai4//in.txt/"; // Đường dẫn file

        // Ghi danh sách số nguyên vào file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {
            int[] numbers = {10, 20, 30, 40, 50};
            for (int num : numbers) {
                dos.writeInt(num);
            }
            System.out.println("Đã ghi danh sách số nguyên vào file.");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }

        // Đọc danh sách số nguyên từ file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {
            System.out.println("Các số nguyên đọc từ file:");
            while (dis.available() > 0) {
                System.out.print(dis.readInt() + " ");
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
