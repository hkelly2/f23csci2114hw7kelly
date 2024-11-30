//4613732

public class Kelly2 {
    public static void main(String[] args) {

        int n = 0, j = 0, k = 1, total = 0;

        while (n < 4000000) {
            n = j + k;
            if (n % 2 != 1) {
                total += n;
            }
            j = k;
            k = n;
        }
        System.out.println("Total: " + total);
    }
}
