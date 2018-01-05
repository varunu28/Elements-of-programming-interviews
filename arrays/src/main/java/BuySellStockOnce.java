import java.util.List;

public class BuySellStockOnce {

    /*
       6.6
    */

    public static int buySellStockOnce(List<Integer> A) {
        int maxProfit = Integer.MIN_VALUE;

        for (int i=0;i<A.size();i++) {
            for (int j=i+1;j<A.size();j++) {
                maxProfit = Math.max(A.get(j)-A.get(i), maxProfit);
            }
        }

        return maxProfit < 0 ? 0 : maxProfit;
    }
}
