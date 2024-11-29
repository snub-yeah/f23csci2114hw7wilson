import java.math.*;

public class Wilson20 {
    public static void main(String[] args) {
        //648
        BigInteger factorial = new BigInteger("100");

        for (int i = 99; i >0; i--) {
            factorial = factorial.multiply(new BigInteger(String.valueOf(i)));
        }

        String factorialString = factorial.toString();
        long result = 0;
        for (char c : factorialString.toCharArray()) {
            result += Character.getNumericValue(c);
        }

        System.out.println(result);
    }
}
