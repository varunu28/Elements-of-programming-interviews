import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnumeratePrimes {

    /*
    6.8
    */

    public static List<Integer> enumeratePrimes(int n) {
        boolean[] numbers = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            if (!numbers[i]) {
                for (int j = 2 * i; j <= n; j += i) {
                    numbers[j] = true;
                }
            }
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (!numbers[i]) {
                list.add(i);
            }
        }

        return list;
    }
}
