//906609

public class Kelly4 {
    public static void main(String[] args) {
        int test = 0;
        int listcount = 0;
        int resultlist[] = new int[2470];
        // 2470 is the ammount of results that the loops below find
        for (int i = 100; i < 1000; i++) {
            for (int j = 100; j < 1000; j++) {
                test = i * j;
                int revTest = Intreverse(test);
                if (test == revTest) {
                    listcount++;
                    resultlist[listcount - 1] = test;
                }
            }
        }
        merge(resultlist);
        System.out.println("Largest = " + resultlist[resultlist.length - 1]);
    }

    private static int Intreverse(int test) {
        int result = 0;
        int remainder = 0;
        while (test > 0) {
            remainder = test % 10;
            result = result * 10 + remainder;
            test = test / 10;
        }
        return result;
    }

    public static void merge(int[] array) {

        if (array.length < 2){
            return;
        }

        int middle = array.length / 2;

        int L[] = new int[middle];
        int R[] = new int[array.length - middle];

        System.arraycopy(array, 0, L, 0, L.length);
        System.arraycopy(array, L.length, R, 0, R.length);

        merge(L);
        merge(R);

        int i = 0, j = 0, k = 0;

        while (i < L.length && j < R.length) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < L.length) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < R.length) {
            array[k] = R[j];
            j++;
            k++;
        }
    }
}