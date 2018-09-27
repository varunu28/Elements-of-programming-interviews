import java.util.Collections;
import java.util.List;

public class DutchNationalFlag {

    /*
    6.1
    */

    public static void dutchNationalFlag(int p, List<Integer> A) {
        int pivot = A.get(p);
        int smaller = 0;
        int equal = 0;
        int larger = p+1;

        while (equal < larger) {
            if (A.get(equal) < pivot) {
                Collections.swap(A, smaller++, equal++);
            }
            else if (A.get(equal) == pivot) {
                ++equal;
            }
            else {
                Collections.swap(A, equal, --larger);
            }
        }
    }

}
