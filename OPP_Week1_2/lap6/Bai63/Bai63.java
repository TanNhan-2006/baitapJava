package Bai63;

public class Bai63 {
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0, 2, 2);
        System.out.println(point); // Initial position

        point.moveUp();
        System.out.println(point); // After moving up

        point.moveRight();
        System.out.println(point); // After moving right
    }
}
