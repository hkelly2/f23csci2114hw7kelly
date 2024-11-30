//31626

import java.util.ArrayList;

public class Kelly21 {
    public static void main(String[] args) {

        int total = 0;
        
        for (int i = 1; i < 10000; i++) {
            int newSum = sumDivisors(i);
            
            if ((i == sumDivisors(newSum)) & (newSum != sumDivisors(newSum))) {
                System.out.println(sumDivisors(i) + ": " + newSum + " = " + sumDivisors(newSum));
                System.out.println(i + "\n");
                total += i;
            }
        }
        System.out.println("Total: " + total);
    }

    public static int sumDivisors(int given) {
        ArrayList<Integer> divisors = new ArrayList<>();
        for (int i = 1; i < given; i++) {
            if (given % i == 0) {
                divisors.add(i);
            }
        }

        int divisorSum = sumArrayList(divisors);
        return divisorSum;
    }

    private static int sumArrayList(ArrayList<Integer> divisors) {
        int sum = 0;
        for (int i = 0; i < divisors.size(); i++) {
            sum = sum + divisors.get(i);
        }
        return sum;
    }
}
