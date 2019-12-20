import java.util.List;

public class AdvanceThroughArray {

    /*
       6.4
    */

  public static boolean arrayAdvance(List<Integer> A) {
    int furthestReachSoFar = 0;
    int lastIdx = A.size() - 1;

    for (int i = 0; i <= furthestReachSoFar && furthestReachSoFar < lastIdx; i++) {
      furthestReachSoFar = Math.max(furthestReachSoFar, i + A.get(i));
    }

    return furthestReachSoFar >= lastIdx;
  }
}
