import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NearestRepeated {

    /*
    13.6
    */

  public static int findNearest(List<String> list) {

    Map<String, Integer> map = new HashMap<>();
    int minDist = Integer.MAX_VALUE;

    for (int i = 0; i < list.size(); i++) {
      if (map.containsKey(list.get(i))) {
        minDist = Math.min(minDist, i - map.get(list.get(i)));
      }

      map.put(list.get(i), i);
    }

    return minDist == Integer.MAX_VALUE ? -1 : minDist;
  }
}
