package Bai64;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.radius = radius;
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public MovablePoint getCenter() {
        return center;
    }

    public void setCenter(MovablePoint center) {
        this.center = center;
    }

    @Override
    public String toString() {
        return center + ", radius=" + radius;
    }

    @Override
    public void moveUp() {
        center.setY(center.getY() - center.getYSpeed());
    }

    @Override
    public void moveDown() {
        center.setY(center.getY() + center.getYSpeed());
    }

    @Override
    public void moveLeft() {
        center.setX(center.getX() - center.getXSpeed());
    }

    @Override
    public void moveRight() {
        center.setX(center.getX() + center.getXSpeed());
    }
}
