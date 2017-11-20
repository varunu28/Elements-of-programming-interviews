import java.util.HashMap;
import java.util.Map;

public class TestCyclicity {

    /*
    8.3
    */

    public static ListNode<Integer> isCyclic(ListNode<Integer> list) {

        Map<ListNode, Integer> map = new HashMap<>();

        ListNode curr = list;
        ListNode prev = null;
        while (list != null) {
            if (!map.containsKey(list)) {
                map.put(list, 1);
            }
            else {
                return list;
            }
            list = list.next;
        }

        return null;
    }
}
