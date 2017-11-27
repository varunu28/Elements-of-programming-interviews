import java.util.*;

public class ComputeBuildingsWithView {

    /*
    9.6
    */

    public static Deque<BuildingWithHeight> examineBuildingsWithSunset(Iterator<Integer>
                                                                               sequence) {
        Deque<BuildingWithHeight> ans = new ArrayDeque<>();
        int c = 0;

        while (sequence.hasNext()) {
            Integer temp = sequence.next();
            while (ans.peekFirst()!=null && temp >= ans.peekFirst().height) {
                ans.removeFirst();
            }
            ans.addFirst(new BuildingWithHeight(c++,temp));
        }

        return ans;
    }
}
