import java.util.HashMap;
import java.util.Map;

public class TestForOverlappingLists {

    /*
    8.4
    */

    public static ListNode<Integer> doListsOverlap(ListNode<Integer> list1, ListNode<Integer> list2) {

        Map<ListNode, Integer> map = new HashMap<>();

        ListNode curr = list1;

        while (curr != null) {
            map.put(curr, (Integer) curr.data);
        }

        curr = list2;

        while (curr != null) {
            if (map.containsKey(curr)) {
                return curr;
            }

            curr = curr.next;
        }

        return null;
    }
}
