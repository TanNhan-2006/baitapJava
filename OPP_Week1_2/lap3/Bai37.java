import java.util.Random;

public class Bai37 {
    public static class Ball{
        private float x;
        private float y;
        private float z;

        public Ball(float x, float y, float z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        public float getX(){
            return x;
        }
        public float getY(){
            return y;
        }
        public float getZ(){
            return z;
        }
        public void setXYZ(float x, float y, float z){
            this.x = x;
            this.y = y;
            this.z = z;
        }
        @Override
        public String toString(){
            return "("+x+","+y+","+z+")";
        }
    }
    public static class Player{
        private int number;
        private float x;
        private float y;
        private float z = 0.0f;

        public Player(int number, float x, float y){
            this.number = number;
            this.x = x;
            this.y = y;
        }
        public void move(float xDisp, float yDisp){
            this.x +=xDisp;
            this.y +=yDisp;
        }
        public void jump(float zDisp){
            this.z+=zDisp;
        }
        public boolean near(Ball ball){
            if(Math.sqrt(Math.pow(ball.getX() - this.x, 2) + Math.pow(ball.getY()-this.y, 2) + Math.pow(ball.getZ()-this.z, 2)) < 8){
                return true;
            }else{
                return false;
            }
        }
        public void kick(Ball ball){
            Random rand = new Random();
            ball.setXYZ(ball.getX() + rand.nextInt(20),
                    ball.getY() + rand.nextInt(20),
                    ball.getZ() + rand.nextInt(5));
        }
    }
    public static void main(String[] args) {
        // Tạo một quả bóng ở vị trí (0,0,0)
        Ball ball = new Ball(0.0f, 0.0f, 0.0f);
        System.out.println("Vị trí ban đầu của bóng: " + ball);

        // Tạo một người chơi số 10 tại vị trí (2,2,0)
        Player player = new Player(10, 2.0f, 2.0f);
        System.out.println("Vị trí ban đầu của người chơi: (" + player.x + "," + player.y + "," + player.z + ")");

        // Di chuyển người chơi
        player.move(3.0f, 4.0f);
        System.out.println("Vị trí của người chơi sau khi di chuyển: (" + player.x + "," + player.y + "," + player.z + ")");

        // Người chơi nhảy lên
        player.jump(1.5f);
        System.out.println("Vị trí của người chơi sau khi nhảy: (" + player.x + "," + player.y + "," + player.z + ")");

        // Kiểm tra xem người chơi có gần bóng không
        boolean isNear = player.near(ball);
        System.out.println("Người chơi có gần bóng không? " + isNear);

        // Người chơi đá bóng
        player.kick(ball);
        System.out.println("Vị trí của bóng sau khi bị đá: " + ball);
    }
}