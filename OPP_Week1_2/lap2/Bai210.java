public class Bai210 {
    public static class MyRectangle {
        private Bai26.MyPoint topLeft;
        private Bai26.MyPoint bottomRight;

        // Constructors
        public MyRectangle() {
            this.topLeft = new Bai26.MyPoint(0, 0);
            this.bottomRight = new Bai26.MyPoint(1, 1);
        }

        public MyRectangle(Bai26.MyPoint topLeft, Bai26.MyPoint bottomRight) {
            this.topLeft = topLeft;
            this.bottomRight = bottomRight;
        }

        public MyRectangle(int x1, int y1, int x2, int y2) {
            this.topLeft = new Bai26.MyPoint(x1, y1);
            this.bottomRight = new Bai26.MyPoint(x2, y2);
        }

        // Getters and setters
        public Bai26.MyPoint getTopLeft() {
            return topLeft;
        }

        public void setTopLeft(Bai26.MyPoint topLeft) {
            this.topLeft = topLeft;
        }

        public Bai26.MyPoint getBottomRight() {
            return bottomRight;
        }

        public void setBottomRight(Bai26.MyPoint bottomRight) {
            this.bottomRight = bottomRight;
        }

        // Calculate width
        public int getWidth() {
            return Math.abs(bottomRight.getX() - topLeft.getX());
        }

        // Calculate height
        public int getHeight() {
            return Math.abs(bottomRight.getY() - topLeft.getY());
        }

        // Calculate area
        public int getArea() {
            return getWidth() * getHeight();
        }

        // Calculate perimeter
        public int getPerimeter() {
            return 2 * (getWidth() + getHeight());
        }

        @Override
        public String toString() {
            return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight + "]";
        }
    }

    public static void main(String[] args) {
        Bai26.MyPoint point1 = new Bai26.MyPoint(1, 4);
        Bai26.MyPoint point2 = new Bai26.MyPoint(5, 1);
        MyRectangle rectangle1 = new MyRectangle(point1, point2);

        System.out.println(rectangle1);
        System.out.println("Width: " + rectangle1.getWidth());
        System.out.println("Height: " + rectangle1.getHeight());
        System.out.println("Area: " + rectangle1.getArea());
        System.out.println("Perimeter: " + rectangle1.getPerimeter());

        MyRectangle rectangle2 = new MyRectangle(2, 6, 8, 2);
        System.out.println(rectangle2);
        System.out.println("Width: " + rectangle2.getWidth());
        System.out.println("Height: " + rectangle2.getHeight());
        System.out.println("Area: " + rectangle2.getArea());
        System.out.println("Perimeter: " + rectangle2.getPerimeter());
    }
}
