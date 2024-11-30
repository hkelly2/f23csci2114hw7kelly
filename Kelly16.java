//1366

import java.math.BigInteger;

public class Kelly16 {
    public static void main(String[] args) {
        BigInteger big = new BigInteger("2");
        big = big.pow(1000);
        String bigNum = big.toString();
        int total = 0;
        for (int i = 0; i < bigNum.length(); i++) {
            total = total + (bigNum.charAt(i) - 48);
        }
        System.out.println(total);
    }
}
