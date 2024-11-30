//232792560

public class Kelly5 {
    public static void main(String[] args) {
        int j = 0, count = 0;
        while (count < 20) {
            j+= 20;
            count = 0;
            for (int i = 1; i <= 20; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
        }
        System.out.println(j);
    }
}
