public class Wilson1 {
    public static void main(String[] args) {
        //233168
        int sum = 0, n = 1000;
        for (int i = 1; i < n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
            sum += i;
            }
        }
        System.out.println(sum);
    }
}