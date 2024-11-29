public class Wilson7 {
    public static void main(String[] args) {
        //104743
        //keep track of primes
        int[] primes = new int[10002];
        int current = 2;

        while (primes[10000] == 0) {
            for (int i = 0; i < primes.length; i++) {
                //if it's made it thru all our array and not been divisible, add it to array
                if (primes[i] == 0) {
                    primes[i] = current;
                    break;
                }
                //if it's divisible by any of the elements, it's not prime lol
                if (current % primes[i] == 0) {
                    break;
                }
            }
            current++;
        }
        System.out.println(primes[10000]);
    }
}