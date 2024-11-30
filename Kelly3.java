//6857

public class Kelly3 {
    public static void main(String[] args) {
        long num = 600851475143L;
        for (int i = 1; i < Math.sqrt(num); i=i+2) {
            if (num % i == 0) {
                System.out.println(i + " is prime? = " + isPrime(i));
            }
        }

    }

    public static boolean isPrime(int given) {
        if (given < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(given); i++) {
            if (given % i == 0) {
                return false;
            }
        }
        return true;
    }
}
