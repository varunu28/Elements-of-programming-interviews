import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MultipleArbitraryPrecisionIntegers {

    /*
    6.3
    */

    public static List<Integer> multiply(List<Integer> a, List<Integer> b) {
        List<Integer> arr = new ArrayList<>();

        boolean isNegative = a.get(0) * b.get(0) < 0 ? true : false;

        if (a.get(0) < 0) {
            a.set(0, a.get(0)*-1);
        }

        if (b.get(0) < 0) {
            b.set(0, b.get(0)*-1);
        }

        int m = a.size();
        int n = b.size();
        int l = m*n;

        for (int i=0; i<l; i++) {
            arr.add(0);
        }
        int carry = 0;

        // Grade school multiplication
        for (int i=m-1; i>=0; i--) {
            int k = l-1;
            for (int j=n-1; j>=0; j--) {
                int num = a.get(i) * b.get(j) + carry + arr.get(k);
                if (num > 9) {
                    carry = num/10;
                    num = num - carry*10;
                }
                else {
                    carry = 0;
                }

                arr.set(k--, num);
            }

            while (carry > 0) {
                int num = arr.get(k) + carry;
                if (num > 9) {
                    carry = num/10;
                    num = num - carry*10;
                }
                else {
                    carry = 0;
                }

                arr.set(k--, num);
            }

            l--;
        }

        // Removing extra zeros
        int zeroCount = -1;
        for (int num : arr) {
            if (num == 0) {
                zeroCount++;
            }
            else {
                break;
            }
        }
        arr = arr.subList(zeroCount+1, arr.size());

        // Updating Sign
        if (isNegative) {
            arr.set(0, arr.get(0) * -1);
        }

        return arr.size() == 0 ? Arrays.asList(0) : arr;
    }
}
