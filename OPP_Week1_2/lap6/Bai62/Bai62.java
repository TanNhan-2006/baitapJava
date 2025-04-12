package Bai62;

public class Bai62 {
    public static void main(String[] args) {
        GeometricObject c1;
        c1 = new Circle(1);
        System.out.println(c1);

        GeometricObject c2;
        c2 = new Circle(2);
        System.out.println(c2);
        System.out.println("Area: " + c2.getArea());
        System.out.println("Perimeter: " + c2.getPerimeter());

        GeometricObject r1;
        r1 = new Rectangle(1, 2);
        System.out.println(r1);
        GeometricObject r2;
        r2 = new Rectangle(3, 4);
        System.out.println(r2);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());
    }
}
