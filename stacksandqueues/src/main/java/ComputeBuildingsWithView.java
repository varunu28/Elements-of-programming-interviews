import java.util.*;

public class ComputeBuildingsWithView {

    /*
    9.6
    */

    public static Deque<BuildingWithHeight> examineBuildingsWithSunset(Iterator<Integer>
                                                                               sequence) {
        Deque<BuildingWithHeight> candidates = new ArrayDeque<>();
        int idx = 0;
        while (sequence.hasNext()) {
            Integer buildingHeight = sequence.next();
            while (!candidates.isEmpty() && (buildingHeight >= candidates.peekLast().height)) {
                candidates.removeLast();
            }
            candidates.addLast(new BuildingWithHeight(idx++, buildingHeight));
        }
        Deque<BuildingWithHeight> ans = new ArrayDeque<>();
        while (!candidates.isEmpty()) {
            ans.addFirst(candidates.removeFirst());
        }
        return ans;
    }
}
