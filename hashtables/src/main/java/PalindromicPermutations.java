import java.util.HashMap;
import java.util.Map;

public class PalindromicPermutations {

    /*
    13.1
    */

  public static boolean canFormPalindrome(String s) {

    Map<Character, Integer> map = new HashMap<>();

    char[] arr = s.toCharArray();

    for (char c : arr) {
      if (map.containsKey(c)) {
        map.put(c, map.get(c) + 1);
      } else {
        map.put(c, 1);
      }
    }

    int counter = 0;

    for (Map.Entry<Character, Integer> entry : map.entrySet()) {

      if (entry.getValue() % 2 != 0) {
        counter++;
      }

      if (counter > 1) {
        return false;
      }
    }

    return true;
  }
}
