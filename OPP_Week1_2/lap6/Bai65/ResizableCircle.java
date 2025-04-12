package Bai65;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }

    public ResizableCircle() {
    }

    @Override
    public String toString() {
        return "ResizableCircle[" + super.toString() +']';
    }



    @Override
    public void resize(int percent) {
        radius *= percent/100;
    }
}