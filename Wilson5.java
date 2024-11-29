public class Wilson5 {
    public static void main(String[] args) {
        //232792560
        int i = 1;
        boolean real = true;
        while (true) { 
            for (int j = 1; j < 21; j++) {
                if (i % j != 0) {
                    real = false;
                    break;
                }
            }
            if (real) {
                System.out.println(i);
                System.exit(0);
            }
            real = true;
            i++;
        }
    }
}
