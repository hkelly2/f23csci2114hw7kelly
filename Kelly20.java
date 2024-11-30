import java.math.BigInteger;

public class Kelly20 {
    public static void main(String[] args) {
        BigInteger big = BigInteger.ONE;
        for (int i = 1; i <= 100; i++) {
            big = big.multiply(BigInteger.valueOf(i));
        }
        String bigNum = big.toString();
        //System.out.println(bigNum);
        int total = 0;
        for (int i = 0; i < bigNum.length(); i++) {
            total = total + (bigNum.charAt(i) - '0');
        }
        System.out.println(total);
    }
}
