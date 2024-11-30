//25164150

public class Kelly6 {
    public static void main(String[] args) {
        int j = 0;
        for (int i = 1; i <= 100; i++) 
            j += i;
        j *= j;
        for (int i = 1; i <= 100; i++) 
            j -= (i * i);
        System.out.println(j);
    }
}
