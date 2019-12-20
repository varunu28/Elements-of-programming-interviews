import java.util.List;

public class IncrementArbitraryPrecisionInteger {

    /*
    6.2
    */

  public static List<Integer> incrementInteger(List<Integer> A) {
    int carry = 1;
    int idx = A.size() - 1;
    while (idx >= 0) {
      int sum = A.get(idx) + carry;
      if (sum <= 9) {
        A.set(idx, sum);
        return A;
      }

      A.set(idx, sum % 10);
      idx--;
    }

    A.add(0, 1);
    return A;
  }
}
