import java.math.BigInteger;
public class Bai33 {
    public static void main(String[] args) {
        BigInteger i1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111");
        BigInteger i2 = new BigInteger("22222222222222222222222222222222222222222222222222");

        // Phép cộng hai số BigInteger
        BigInteger sum = i1.add(i2);
        System.out.println("Tổng: " + sum);

        // Phép nhân hai số BigInteger
        BigInteger product = i1.multiply(i2);
        System.out.println("Tích: " + product);
    }
}
