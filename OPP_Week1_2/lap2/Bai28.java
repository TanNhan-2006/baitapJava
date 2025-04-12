public class Bai28 {
    public static class MyCircle {
        private Bai26.MyPoint center;
        private int radius;

        public MyCircle() {
            this.center = new Bai26.MyPoint(0, 0);
            this.radius = 1;
        }

        public MyCircle(int x, int y, int radius) {
            this.center = new Bai26.MyPoint(x, y);
            this.radius = radius;
        }

        public MyCircle(Bai26.MyPoint center, int radius) {
            this.center = center;
            this.radius = radius;
        }

        // Radius
        public int getRadius() {
            return radius;
        }

        public void setRadius(int radius) {
            this.radius = radius;
        }

        // Center
        public Bai26.MyPoint getCenter() {
            return center;
        }

        public void setCenter(Bai26.MyPoint center) {
            this.center = center;
        }

        // CenterX
        public int getCenterX() {
            return center.getX();
        }

        public void setCenterX(int x) {
            this.center.setX(x);
        }

        // CenterY
        public int getCenterY() {
            return center.getY();
        }

        public void setCenterY(int y) {
            this.center.setY(y);
        }

        // CenterXY
        public int[] getCenterXY() {
            return new int[] { center.getX(), center.getY() };
        }

        public void setCenterXY(int x, int y) {
            this.center.setX(x);
            this.center.setY(y);
        }

        // Area
        public double getArea() {
            return Math.PI * radius * radius;
        }

        // Circumference
        public double getCircumference() {
            return 2 * Math.PI * radius;
        }

        // Distance
        public double distance(MyCircle another) {
            return center.distance(another.center); // use distance() of MyPoint
        }

        @Override
        public String toString() {
            return "MyCircle[radius=" + radius + ", center=" + center + "]";
        }
    }

    public static void main(String[] args) {
        MyCircle circle1 = new MyCircle();
        MyCircle circle2 = new MyCircle(5, 10, 3);
        Bai26.MyPoint point = new Bai26.MyPoint(2, 3);
        MyCircle circle3 = new MyCircle(point, 4);

        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);

        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Circumference of circle2: " + circle2.getCircumference());
        System.out.println("Distance between circle2 and circle3: " + circle2.distance(circle3));
    }
}
