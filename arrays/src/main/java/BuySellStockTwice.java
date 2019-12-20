import java.util.ArrayList;
import java.util.List;

public class BuySellStockTwice {

    /*
    6.7
    */

  public static int buySellStockTwice(List<Integer> A) {
    List<Integer> firstTransactionList = new ArrayList<>();
    int minPriceSoFar = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (Integer price : A) {
      minPriceSoFar = Math.min(minPriceSoFar, price);
      maxProfit = Math.max(maxProfit, price - minPriceSoFar);
      firstTransactionList.add(maxProfit);
    }
    int maxPriceSoFar = Integer.MIN_VALUE;
    for (int i = A.size() - 1; i > 0; i--) {
      maxPriceSoFar = Math.max(maxPriceSoFar, A.get(i));
      maxProfit = Math.max(maxProfit, maxPriceSoFar - A.get(i) + firstTransactionList.get(i - 1));
    }
    return maxProfit;
  }
}
