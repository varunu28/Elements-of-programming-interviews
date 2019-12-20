import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultipleArbitraryPrecisionIntegers {

    /*
    6.3
    */

  public static List<Integer> multiply(List<Integer> a, List<Integer> b) {
    if (a.isEmpty() || b.isEmpty()) {
      return Arrays.asList(0);
    }

    List<Integer> list = new ArrayList<>();
    int size = a.size() + b.size();
    int sign = (a.get(0) < 0 ? -1 : 1) * (b.get(0) < 0 ? -1 : 1);
    a.set(0, Math.abs(a.get(0)));
    b.set(0, Math.abs(b.get(0)));

    for (int i = 0; i < size; i++) {
      list.add(0);
    }

    int idx = size - 1;
    int carry = 0;

    for (int i = a.size() - 1; i >= 0; i--) {
      int tempIdx = idx;
      for (int j = b.size() - 1; j >= 0; j--) {
        int num = list.get(tempIdx) + carry + a.get(i) * b.get(j);
        if (num > 9) {
          carry = num / 10;
          num %= 10;
        } else {
          carry = 0;
        }

        list.set(tempIdx, num);
        tempIdx--;
      }

      if (carry > 0) {
        list.set(tempIdx, carry);
        carry = 0;
      }
      idx--;
    }

    int zeroIdx = 0;
    while (zeroIdx < size && list.get(zeroIdx) == 0) {
      zeroIdx++;
    }

    List<Integer> ans = new ArrayList<>();
    for (int i = zeroIdx; i < size; i++) {
      ans.add(list.get(i));
    }

    if (ans.isEmpty()) {
      return Arrays.asList(0);
    }

    ans.set(0, ans.get(0) * sign);
    return ans;
  }
}
