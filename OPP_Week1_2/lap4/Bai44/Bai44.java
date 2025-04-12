package Bai44;

public class Bai44 {
    public static void main(String[] args) {
        MovablePoint m1 = new MovablePoint();
        System.out.println(m1);
        MovablePoint m2 = new MovablePoint(1, 2);
        System.out.println(m2);
        MovablePoint m3 = new MovablePoint(3, 4, 5, 6);
        System.out.println(m3);

        m1.setX(7);
        m1.setY(8);
        m1.setxSpeed(9);
        m1.setySpeed(10);
        System.out.println(m1);
        System.out.println("Move: " + m1.move());
    }
}
