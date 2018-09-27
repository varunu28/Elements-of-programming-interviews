import java.util.Collections;
import java.util.List;

public class IncrementArbitraryPrecisionInteger {

    /*
    6.2
    */

    public static List<Integer> incrementInteger(List<Integer> A) {
        int carry = 1;

        Collections.reverse(A);

        for (int i = 0; i < A.size(); i++) {
            int num = A.get(i) + carry;

            if (num > 9) {
                carry = 1;
                num = 0;
            }
            else {
                carry = 0;
            }

            A.set(i, num);
        }

        if (carry == 1) {
            A.add(1);
        }

        Collections.reverse(A);

        return A;
    }
}
