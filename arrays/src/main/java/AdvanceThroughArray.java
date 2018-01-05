import java.util.List;

public class AdvanceThroughArray {

    /*
       6.4
    */

    public static boolean arrayAdvance(List<Integer> A) {

        int lastReach = 0;
        int lastInd = A.size()-1;

        for (int i=0;i<=lastReach && lastReach < lastInd; i++) {
            lastReach = Math.max(lastReach, i + A.get(i));
        }

        return lastReach >= lastInd;
    }
}
