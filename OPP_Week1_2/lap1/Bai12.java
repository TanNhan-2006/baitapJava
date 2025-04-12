public class Bai12 {
    public static class Circle{
        private double radius = 1.0;

        public Circle(){

        }

        public Circle(double radius){
            this.radius = radius;
        }

        public double getRadius(){
            return radius;
        }

        public void setRadius(double radius){
            this.radius = radius;
        }

        public double getArea(){
            return Math.PI * radius * radius;
        }

        public double getCircumference(){
            return 2 * Math.PI * radius;
        }

        @Override
        public String toString(){
            return "Circle[radius="+radius+"]";
        }

    }

    public static void main(String[] args){
        Circle c1 = new Circle(1.1);
        System.out.println(c1);
        Circle c2 = new Circle();
        System.out.println(c2);
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("bán kính là: " + c1.getRadius());
        System.out.printf("diện tích là: %.2f%n", c1.getArea());
        System.out.printf("chu vi là: %.2f%n", c1.getCircumference());
    }
}
