package Bai52;

public class Bai52 {
    public static void main(String[] args) {
        // Tạo đối tượng Circle
        Circle circle1 = new Circle(2.5, "blue");
        System.out.println(circle1);

        // Tạo đối tượng Cylinder
        Cylinder cylinder1 = new Cylinder(3.0, 5.0, "green");
        System.out.println(cylinder1);

        // Tính thể tích của Cylinder
        System.out.println("Volume: " + cylinder1.getVolume());

        // Sử dụng Cylinder với hai Circle
        Cylinder cylinder2 = new Cylinder(3.0, "yellow", 2.0, "pink", 4.0);
        System.out.println(cylinder2);
    }
}
