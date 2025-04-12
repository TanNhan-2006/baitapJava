public class Bai27 {
    public static class MyLine{
        private Bai26.MyPoint begin;
        private Bai26.MyPoint end;

        public MyLine(int x1,int y1,int x2,int y2) {
            this.begin = new Bai26.MyPoint(x1, y1);
            this.end = new Bai26.MyPoint(x2, y2);
        }
        public MyLine(Bai26.MyPoint begin, Bai26.MyPoint end) {
            this.begin = begin;
            this.end = end;
        }
        //Begin 2
        public Bai26.MyPoint getBegin() {
            return begin;
        }
        public void setBegin(Bai26.MyPoint begin) {
            this.begin = begin;
        }

        //End 2
        public Bai26.MyPoint getEnd() {
            return end;
        }
        public void setEnd(Bai26.MyPoint end) {
            this.end = end;
        }

        //Begin x 2
        public Bai26.MyPoint getBeginX() {
            return begin;
        }
        public void setBeginX(Bai26.MyPoint begin) {
            this.begin = begin;
        }
        //Begin y 2
        public Bai26.MyPoint getBeginY() {
            return end;
        }
        public void setBeginY(Bai26.MyPoint begin) {
            this.begin = begin;
        }
        //End x 2
        public Bai26.MyPoint getEndX() {
            return end;
        }
        public void setEndX(Bai26.MyPoint end) {
            this.end = end;
        }
        //End y 2
        public Bai26.MyPoint getEndY() {
            return end;
        }
        public void setEndY(Bai26.MyPoint end) {
            this.end = end;
        }
        //BeginXY 2
        public int[] getBeginXY() {
            return begin.getXY();
        }
        public void setBeginXY(int[] beginXY) {
            this.begin = new Bai26.MyPoint(beginXY[0], beginXY[1]);
        }
        //EndXY 2
        public int[] getEndXY() {
            return end.getXY();
        }
        public void setEndXY(int[] endXY) {
            this.end = new Bai26.MyPoint(endXY[0], endXY[1]);
        }
        //Length
        public double getLength() {
            return begin.distance(end);
        }
        //Gradient
        public double getGradient() {
            int xDiff = end.getX() - begin.getX();
            int yDiff = end.getY() - begin.getY();
            return Math.atan2(yDiff, xDiff);
        }
        @Override
        public String toString() {
            return "MyLine[begin=("+begin+"),end=("+end+")]";
        }

    }

    public static void main(String[] args) {
        Bai26.MyPoint point1 = new Bai26.MyPoint(1, 2);
        Bai26.MyPoint point2 = new Bai26.MyPoint(4, 6);
        MyLine line = new MyLine(point1, point2);
        System.out.println(line);
        System.out.println("Length: " + line.getLength());
        System.out.println("Gradient: " +  line.getGradient());
    }
}
