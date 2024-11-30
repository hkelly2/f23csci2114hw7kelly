//142913828922

public class Kelly10 {
    public static void main(String[] args) {
        System.out.println(sieve(2000000));
    }
        
    private static long sieve(int given) {
        boolean[] primes = new boolean[given];
        primes[0] = true;
        primes[1] = true;

        for (long i = 2; i < given; i ++) {
            if (primes[(int) i] == false) {
                for (long j = i*i; j < given; j=j+i) {
                    primes[(int) j] = true;
                }
            }
        }
        
        long count = 0;
        for (int i = 0; i < given; i++) {
            if (primes[i] == false) {
                count = count + i;
            }
        }
        return count;
    }
}