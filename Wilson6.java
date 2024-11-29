public class Wilson6 {
    public static void main(String[] args) {
        //25164150
        int sumOfSquares = 0, sum = 0, difference = 0, n = 1;
        while (n < 101) {
            sum += n;
            sumOfSquares += Math.pow(n, 2);

            n++;
        }
        sum = (int)Math.pow(sum, 2);
        difference = sum - sumOfSquares;
        System.out.println(difference);
    }
}
