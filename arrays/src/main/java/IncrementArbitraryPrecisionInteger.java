import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncrementArbitraryPrecisionInteger {

    /*
    6.2
    */

    public static List<Integer> incrementInteger(List<Integer> A) {

        Collections.reverse(A);
        int carry = 1;

        for (int j=0; j<A.size(); j++) {
            int n = A.get(j) + carry;

            if (n > 9) {
                carry = n - 9;
                n -= 10;
            }
            else {
                carry = 0;
            }

            A.set(j, n);
        }

        Collections.reverse(A);

        return A;
    }
}
