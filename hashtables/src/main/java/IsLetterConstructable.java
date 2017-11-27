import java.util.HashMap;
import java.util.Map;

public class IsLetterConstructable {

    /*
    13.2
    */

    public static boolean isConstructable(String letterText, String magazineText) {

        Map<Character, Integer> letterMap = new HashMap<>();

        char[] letterArr = letterText.toLowerCase().toCharArray();

        for (char c : letterArr) {
            if (letterMap.containsKey(c)) {
                letterMap.put(c, letterMap.get(c) + 1);
            }
            else {
                letterMap.put(c, 1);
            }
        }

        char[] magazineArr = magazineText.toLowerCase().toCharArray();

        for (char c : magazineArr) {
            if (letterMap.containsKey(c)) {
                letterMap.put(c, letterMap.get(c)-1);
            }

            if (letterMap.containsKey(c) && letterMap.get(c) == 0) {
                letterMap.remove(c);
            }

            if (letterMap.isEmpty()) {
                break;
            }
        }

        return letterMap.isEmpty();
    }
}
