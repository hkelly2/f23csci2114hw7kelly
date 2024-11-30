//104743

public class Kelly7 {
    public static void main(String[] args) {
        sieve(1000000);
    }
        
    private static void sieve(int maxValue) {
        boolean[] primes = new boolean[maxValue];
        primes[0] = true;
        primes[1] = true;

        for (long i = 2; i < maxValue; i ++) {
            if (primes[(int) i] == false) {
                for (long j = i*i; j < maxValue; j=j+i) {
                    primes[(int) j] = true;
                }
            }
        }

        int count = 0;
        for (int i = 0; count < 10001; i++) {
            if (primes[i] == false) {
                count++;
                System.out.println("Prime #" + count + " = " + i);
            }
        }
        System.out.println("DING DING DING!!!");
    }
}
