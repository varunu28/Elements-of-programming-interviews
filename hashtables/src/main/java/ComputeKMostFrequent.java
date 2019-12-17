import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class ComputeKMostFrequent {

    /*
    13.5
    */

    public static List<String> mostFrequent(List<String> list, int k) {
        Map<String, Long> map = list.stream().collect(
            Collectors.groupingBy(identity(), counting())
        );
        PriorityQueue<String> pq = new PriorityQueue<>(
            (o1, o2) -> (int) (map.get(o1) - map.get(o2))
        );
        for (String key : map.keySet()) {
            pq.add(key);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        List<String> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll());
        }
        return ans;
    }
}
