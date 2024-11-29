public class Wilson14 {
    public static void main(String[] args) {
        //837799
        long maxChain = 0, currChain = 0;
        long maxNumber = 0, number = 0;
        for (int i = 1; i < 1000000; i++) {
            number = i;
            currChain = 0;
            //while the number is not 1, because that's the end of the chain
            while (number != 1) {
            if (isEven(number)) {
                number = number /2;
            } else {
                number = 3 * number;
                number++;
            }
            currChain++;
        }
        //at the end of nested loop, check if our new chain size is larger than previous
        if (currChain > maxChain) {
            maxNumber = i;
            maxChain = currChain;
        }
        }
        System.out.println(maxNumber);
    }

    public static boolean isEven(long n) {
        return (n % 2 == 0);
    }
}
