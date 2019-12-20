import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LongestSubarray {

    /*
    13.9
    */

  public static int longestSubarray(List<Integer> list) {
    int slow = 0;
    int end = 0;
    int n = list.size();
    int maxSize = 0;
    Map<Integer, Integer> map = new HashMap<>();
    while (end < n) {
      map.put(list.get(end), map.getOrDefault(list.get(end), 0) + 1);
      while (slow < end && map.get(list.get(end)) > 1) {
        map.put(list.get(slow), map.getOrDefault(list.get(slow), 0) - 1);
        if (map.get(list.get(slow)) == 0) {
          map.remove(list.get(slow));
        }
        slow++;
      }
      end++;
      maxSize = Math.max(maxSize, map.size());
    }
    return maxSize;
  }
}
