package Bai51;

public class Point {

    // Các biến
    private int x;    // x co phan tu
    private int y;    // y tọa độ

    // Constructor
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Phương thức công khai
    public String toString() {
        return "Point:(" + x + "," + y + ")";
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

}