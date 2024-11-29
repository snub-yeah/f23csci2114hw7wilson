import java.math.*;

public class Wilson48 {
    public static void main(String[] args) {
        //9110846700
        BigInteger sum = BigInteger.ZERO;
        BigInteger number = BigInteger.ONE;

        for (int i = 1; i < 1001; i++) {
            number = new BigInteger(String.valueOf(i));
            number = number.pow(i);
            sum = sum.add(number);
        }
        String sumString = sum.toString();
        System.out.println(sumString.substring(sumString.length() - 10));
    }
}
