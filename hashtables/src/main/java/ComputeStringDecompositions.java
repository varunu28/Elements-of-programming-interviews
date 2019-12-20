import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeStringDecompositions {

    /*
    13.12
    */

    public static List<String> findAllSubstring(String s, List<String> words) {
        if (s.length() == 0 || words.size() == 0) {
            return new ArrayList<>();
        }
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        int n = s.length();
        int singleWordLength = words.get(0).length();
        List<String> list = new ArrayList<>();
        for (int i = 0; i + singleWordLength * words.size() <= n; i++) {
            if (match(s, map, i, words.size(), singleWordLength)) {
                list.add(s.substring(i, i + singleWordLength * words.size()));
            }
        }
        return list;
    }

    private static boolean match(String s, Map<String, Integer> map, int start, int size, int singleWordLength) {
        Map<String, Integer> stringFreq = new HashMap<>();
        for (int i = 0; i < size; i++) {
            String currWord = s.substring(start + i * singleWordLength, start + (i + 1) * singleWordLength);
            Integer freq = map.get(currWord);
            // Word does not exist in required word list
            if (freq == null) {
                return false;
            }
            stringFreq.put(currWord, stringFreq.getOrDefault(currWord, 0) + 1);
            // Word occurs more than the required number
            if (stringFreq.get(currWord) > freq) {
                return false;
            }
        }
        return true;
    }
}
