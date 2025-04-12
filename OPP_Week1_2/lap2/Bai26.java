public class Bai26 {
    public static class MyPoint {
        private int x;
        private int y;

        public MyPoint() {

        }

        public MyPoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        //X 2
        public int getX() {
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        //Y 2
        public int getY() {
            return y;
        }

        public void setY(int y) {
            this.y = y;
        }

        //XY 2
        public int[] getXY() {
            return new int[]{x, y};
        }

        public void setXY(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + "," + y + ")";
        }

        public double distance(int x, int y) {
            return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - this.y, 2));
        }

        public double distance(MyPoint pnother) {
            return distance(pnother.x, pnother.y);
        }

        public double distance() {
            return distance(0, 0);
        }
    }

    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 4);
        MyPoint p2 = new MyPoint(0, 0);

        System.out.println("Point p1: " + p1);
        System.out.println("Point p2: " + p2);
        System.out.println("Distance from p1 to (5, 6): " + p1.distance(5, 6));
        System.out.println("Distance from p1 to p2: " + p1.distance(p2));
        System.out.println("Distance from p1 to origin: " + p1.distance());
    }
}
