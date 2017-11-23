import java.util.ArrayList;
import java.util.List;

public class ListPivot {

    /*
    8.12
    */

    public static ListNode<Integer> pivot(ListNode<Integer> list, int k) {

        List<Integer> equal = new ArrayList<>();
        List<Integer> less = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        ListNode curr = list;

        while (curr != null) {

            if ((int) curr.data > k) {
                greater.add((int)curr.data);
            }
            else if ((int) curr.data < k) {
                less.add((int)curr.data);
            }
            else {
                equal.add((int)curr.data);
            }

            curr = curr.next;
        }

        curr = list;

        for (int i=0;i<less.size();i++) {
            curr.data = less.get(i);
            curr = curr.next;
        }

        for (int i=0;i<equal.size();i++) {
            curr.data = equal.get(i);
            curr = curr.next;
        }

        for (int i=0;i<greater.size();i++) {
            curr.data = greater.get(i);
            curr = curr.next;
        }

        return list;
    }

}
