package Bai61;

public class Circle extends Shape{
    protected double radius=1.0;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getArea(){
        return this.radius*this.radius*Math.PI;
    }

    public double getPerimeter(){
        return this.radius*2*Math.PI;
    }

    @Override
    public String toString() {
        return "Circle["+ super.toString() + ",radius=" + radius + ']';
    }

    public void setRadius(int radius) {
        this.radius = radius;//To change body of generated methods, choose Tools | Templates.
    }
}