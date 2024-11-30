//233168

public class Kelly1 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 1000; i = i + 3) {
            total += i;
        }
        for (int i = 0; i < 1000; i = i + 5) {
            if (i % 3 != 0) {
                total += i;
            }
        }
        System.out.println(total);
    }
}
