import java.util.List;

public class BuySellStockOnce {

    /*
       6.6
    */

  public static int buySellStockOnce(List<Integer> A) {
    int minPrice = Integer.MAX_VALUE;
    int maxProfit = 0;

    for (int i = 0; i < A.size(); i++) {
      if (minPrice == Integer.MAX_VALUE || minPrice > A.get(i)) {
        minPrice = A.get(i);
      } else {
        if (maxProfit < A.get(i) - minPrice) {
          maxProfit = A.get(i) - minPrice;
        }
      }
    }

    return maxProfit;
  }
}
