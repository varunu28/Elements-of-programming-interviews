import java.util.Collections;
import java.util.List;

public class DutchNationalFlag {

    /*
    6.1
    */

    public static void dutchNationalFlag(int p, List<Integer> A) {
        int pivot = A.get(p);

        int small = 0;
        int equal = 0;
        int large = p+1;

        while (equal < large) {
            if (A.get(equal) < pivot) {
                Collections.swap(A, small++, equal++);
            }
            else if (A.get(equal) == pivot) {
                equal++;
            }
            else {
                Collections.swap(A, equal, --large);
            }
        }
    }

}
