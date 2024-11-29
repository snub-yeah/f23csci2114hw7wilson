public class Wilson2 {
    public static void main(String[] args) {
        //4613732
        int sum = 0, n = 4000000;
        int a = 1, b = 2;
        while (b < n) {
            if (b % 2 == 0) {
                sum += b;
            }
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(sum);
    }
}