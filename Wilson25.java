import java.math.*;
import java.util.*;

public class Wilson25 {
    public static void main(String[] args) {
        //4782
        Queue<BigInteger> queue = new LinkedList<BigInteger>();
        queue.add(BigInteger.ONE);
        queue.add(BigInteger.ONE);
        int index = 2;
        BigInteger sum = BigInteger.ZERO;
        BigInteger num1 = BigInteger.ZERO, num2 = BigInteger.ZERO;
        while (true) { 
            sum = BigInteger.ZERO;
            num1 = queue.poll();
            num2 = queue.peek();
            sum = num1.add(num2);
            queue.add(sum);
            index++;
            if (sum.toString().length() >= 1000) {
                System.out.println(index);
                System.exit(0);
            }
        }
    }
}
