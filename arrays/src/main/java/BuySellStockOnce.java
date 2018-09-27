import java.util.List;

public class BuySellStockOnce {

    /*
       6.6
    */

    public static int buySellStockOnce(List<Integer> A) {
        int lowestPrice = Integer.MIN_VALUE;
        int maxProfit = 0;

        for (int i=0; i<A.size(); i++) {
            if (lowestPrice == Integer.MIN_VALUE) {
                lowestPrice = A.get(i);
            }
            else {
                lowestPrice = Math.min(lowestPrice, A.get(i));
                maxProfit = Math.max(maxProfit, A.get(i) - lowestPrice);
            }
        }

        return maxProfit;
    }
}
