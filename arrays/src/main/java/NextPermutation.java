import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NextPermutation {

    /*
    6.10
    */

  public static List<Integer> nextPermutation(List<Integer> permutation) {
    int rightToLeft = permutation.size() - 1;
    boolean flag = false;
    while (rightToLeft > 0 && !flag) {
      if (permutation.get(rightToLeft) > permutation.get(rightToLeft - 1)) {
        int leftToRight = rightToLeft;
        int smallerNum = permutation.get(rightToLeft - 1);
        int smallestNumGreater = Integer.MAX_VALUE;
        int smallestNumIdx = -1;
        while (leftToRight < permutation.size()) {
          if (permutation.get(leftToRight) > smallerNum && smallestNumGreater > permutation
              .get(leftToRight)) {
            smallestNumGreater = permutation.get(leftToRight);
            smallestNumIdx = leftToRight;
          }
          leftToRight++;
        }
        if (smallestNumIdx == -1) {
          break;
        }
        permutation.set(rightToLeft - 1, smallestNumGreater);
        permutation.set(smallestNumIdx, smallerNum);
        List<Integer> temp = new ArrayList<>();
        int tempIdx = rightToLeft;
        while (tempIdx < permutation.size()) {
          temp.add(permutation.get(tempIdx++));
        }
        Collections.sort(temp);
        tempIdx = 0;
        int queryIdx = rightToLeft;
        while (queryIdx < permutation.size()) {
          permutation.set(queryIdx++, temp.get(tempIdx++));
        }
        flag = true;
      }
      rightToLeft--;
    }
    return flag ? permutation : Collections.emptyList();
  }
}
