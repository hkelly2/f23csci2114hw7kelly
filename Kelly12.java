public class Kelly12old {
    static int total = 0;
        public static void main(String[] args) {
    
            int triNum = 0, n = 1;
            boolean totalDivisors = false;
            
            while (true) {
                triNum = n * (n + 1) / 2;
                totalDivisors = totalDivisors(triNum);
            if (totalDivisors == true) {
                System.out.println(triNum);
                break;
            }
            n++;
            }
        }
    
        public static boolean totalDivisors(int given) {
        int divisors = 0;
        for (int i = 1; i < Math.sqrt(given); i++) {
            if (given % i == 0) {
                divisors+=2;
                if (i == given / i) {
                    divisors--;
                }
            }
        }
        if (divisors > total) {
            total = divisors;
            System.out.println("Largest = " + given + " with " + divisors);
        }
        if (divisors > 500) {
            return true;
        }
        return false;
    }
}
