public class Bai29 {
    public static class MyTriangle {
        private Bai26.MyPoint v1;
        private Bai26.MyPoint v2;
        private Bai26.MyPoint v3;

        public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
            this.v1 = new Bai26.MyPoint(x1, y1);
            this.v2 = new Bai26.MyPoint(x2, y2);
            this.v3 = new Bai26.MyPoint(x3, y3);
        }

        public MyTriangle(Bai26.MyPoint v1, Bai26.MyPoint v2, Bai26.MyPoint v3) {
            this.v1 = v1;
            this.v2 = v2;
            this.v3 = v3;
        }

        public double getPerimeter() {
            double side1 = v1.distance(v2);
            double side2 = v2.distance(v3);
            double side3 = v3.distance(v1);
            return side1 + side2 + side3;
        }

        public String getType() {
            double side1 = v1.distance(v2);
            double side2 = v2.distance(v3);
            double side3 = v3.distance(v1);
            if (side1 == side2 && side2 == side3) {
                return "Equilateral";
            } else if (side1 == side2 || side2 == side3 || side3 == side1) {
                return "Isosceles";
            } else {
                return "Scalene";
            }
        }

        @Override
        public String toString() {
            return "MyTriangle[v1=" + v1 + ", v2=" + v2 + ", v3=" + v3 + "]";
        }
    }

    public static void main(String[] args) {
        MyTriangle triangle1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        Bai26.MyPoint point1 = new Bai26.MyPoint(1, 1);
        Bai26.MyPoint point2 = new Bai26.MyPoint(4, 1);
        Bai26.MyPoint point3 = new Bai26.MyPoint(1, 5);
        MyTriangle triangle2 = new MyTriangle(point1, point2, point3);

        System.out.println(triangle1);
        System.out.println("Perimeter of triangle1: " + triangle1.getPerimeter());
        System.out.println("Type of triangle1: " + triangle1.getType());

        System.out.println(triangle2);
        System.out.println("Perimeter of triangle2: " + triangle2.getPerimeter());
        System.out.println("Type of triangle2: " + triangle2.getType());
    }
}
