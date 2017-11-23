import java.util.ArrayList;
import java.util.List;

public class EvenOddMerge {

    /*
    8.10
    */

    public static ListNode<Integer> merge(ListNode<Integer> list) {

        List<Integer> even = new ArrayList<>();
        List<Integer> odd = new ArrayList<>();

        ListNode curr = list;

        while (curr != null) {
            if ((int)curr.data % 2 == 0) {
                even.add((int)curr.data);
            }
            else {
                odd.add((int)curr.data);
            }

            curr = curr.next;
        }

        curr = list;
        int i = 0;

        while (curr != null && i < even.size()) {
            curr.data = even.get(i);
            i++;
            curr = curr.next;
        }

        i = 0;
        while (curr != null && i < odd.size()) {
            curr.data = odd.get(i);
            i++;
            curr = curr.next;
        }

        return list;
    }

}
