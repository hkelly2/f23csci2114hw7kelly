//837799

public class Kelly14 {
    public static void main(String[] args) {
        int bestNum = 0;
        int bestChain = 0;
        int check = 0;
        for (int i = 1; i < 1000000; i++) {

            check = Collatz(i, 0);
            
            if (check > bestChain) {
                bestChain = check;
                bestNum = i;
                //System.out.println("#" + i + " chain: " + check);
            }
        }
        System.out.println("Longest Chain: " + bestChain + " From " + bestNum);
    }

    public static int Collatz(long given, int count) {

        if (given == 1) {
            return count;
        }
        if (given % 2 == 0) {
            return Collatz(given/2, count+1);
        } else {
            return Collatz((3 * given) + 1, count+1);
        }
    }
}
