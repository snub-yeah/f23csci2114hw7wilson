import java.math.BigInteger;

public class Wilson16 {
    public static void main(String[] args) {
        //1366
        BigInteger result = BigInteger.ONE;
        for (int i = 0; i < 1000; i ++) {
            result = result.multiply(new BigInteger("2"));
        }
        BigInteger sum = BigInteger.ZERO;
        String resultString = result.toString();

        for (char c : resultString.toCharArray()) {
            sum = sum.add(new BigInteger(String.valueOf(c)));
        }
        System.out.println(sum);
    }
}
