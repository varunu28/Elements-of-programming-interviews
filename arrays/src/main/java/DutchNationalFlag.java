import java.util.Collections;
import java.util.List;

public class DutchNationalFlag {

    /*
    6.1
    */

  public static void dutchNationalFlag(int p, List<Integer> A) {
    int replacementIdx = 0;
    int pivotVal = A.get(p);

    // Travel from left to right and keep swapping with replacement index if less than pivot found
    for (int i = 0; i < A.size(); i++) {
      if (A.get(i) < pivotVal) {
        Collections.swap(A, i, replacementIdx);
        replacementIdx++;
      }
    }

    replacementIdx = A.size() - 1;

    // Travel from right to left and keep swapping with replacement index if greater than pivot found
    for (int i = A.size() - 1; i >= 0; i--) {
      if (A.get(i) > pivotVal) {
        Collections.swap(A, i, replacementIdx);
        replacementIdx--;
      }
    }
  }
}
