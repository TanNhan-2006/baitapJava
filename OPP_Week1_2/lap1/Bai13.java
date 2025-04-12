public class Bai13 {
    public static class Rectangle {
        private float lenght = 1.0f;
        private float width = 1.0f;

        public Rectangle(){

        }

        public Rectangle(float lenght, float width){
            this.lenght = lenght;
            this.width = width;
        }

        public float getLenght(){
            return lenght;
        }

        public void setLenght(float lenght){
            this.lenght = lenght;
        }

        public float getWidth(){
            return width;
        }
        public void setWidth(float width){
            this.width = width;
        }

        public double getArea(){
            return width*lenght;
        }
        public double getPerimeter(){
            return 2*(width+lenght);
        }

        @Override
        public String toString(){
            return "Rectangle[length="+lenght+",width="+width+"]";
        }
    }
    public static void main(String[] args) {
        Rectangle S1 = new Rectangle(1.2f,3.4f);
        System.out.println(S1);
        Rectangle S2 = new Rectangle();
        S1.setLenght(5.6f);
        S1.setWidth(7.8f);
        System.out.println(S1);
        System.out.println("chieu dai la: "+S1.getLenght());
        System.out.println("chieu rong la: "+S1.getWidth());
        System.out.printf("Dien tich la: %.2f.%n",S1.getArea());
        System.out.printf("Chu vi la: %.2f.%n",S1.getPerimeter());
    }
}
