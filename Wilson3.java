public class Wilson3 {
    public static void main(String[] args) {
        // 6857
        long goal = 600851475143L;
        long max = 0;
        for (long i = 2; i <= goal; i++) {
            if (goal % i == 0) {
                goal /= i;
                max = i;
            }
        }
        System.out.println(max);
    }
}
