public class Wilson4 {
    public static void main(String[] args) {
        //906609

        //this is terrible time complexity, but it works :D
        int mult, start, end;
        int max = 0;
        boolean real = true;
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                mult = i * j;
                String multString = String.valueOf(mult);
                start = 0;
                end = multString.length() -1;
                //check if the start and end of the string version of the number are the same
                if (mult > max) { //we only have to even check if it is greater than our current max. otherwise, there's no point
                while (start <= end) {
                    if (multString.charAt(start) != multString.charAt(end)) {
                        real = false;
                        break;
                    }
                    start ++;
                    end--;
                }
                if (real) {
                    max = mult;
                }
            }
                real = true; //no matter what, we set our flag back to true.
            }
        }
        System.out.println(max);

    }
}
