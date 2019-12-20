import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SmallestSubarray {

    /*
    13.7
    */

  public static Tuple findSubarray(List<String> paragraph, Set<String> keywords) {
    int slow = 0;
    int fast = 0;
    int minStart = 0;
    int minEnd = 0;
    int distance = Integer.MAX_VALUE;
    Map<String, Integer> map = new HashMap<>();
    for (String keyword : keywords) {
      map.put(keyword, 1);
    }
    int n = paragraph.size();
    int count = map.size();
    while (fast < n) {
      if (map.containsKey(paragraph.get(fast))) {
        map.put(paragraph.get(fast), map.get(paragraph.get(fast)) - 1);
        if (map.get(paragraph.get(fast)) == 0) {
          count--;
        }
      }
      while (count == 0) {
        if (fast - slow + 1 < distance) {
          minStart = slow;
          minEnd = fast;
          distance = fast - slow + 1;
        }
        if (map.containsKey(paragraph.get(slow))) {
          map.put(paragraph.get(slow), map.get(paragraph.get(slow)) + 1);
          if (map.get(paragraph.get(slow)) == 1) {
            count++;
          }
        }
        slow++;
      }
      fast++;
    }
    return new Tuple(minStart, minEnd);
  }
}
