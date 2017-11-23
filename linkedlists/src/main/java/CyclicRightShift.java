public class CyclicRightShift {

    /*
    8.9
    */

    public static ListNode<Integer> shift(int k, ListNode<Integer> list) {

        ListNode curr = list;
        int length = 1;

        while (curr.next != null) {
            curr = curr.next;
            length++;
        }

        k = k%length;

        if (k == 0) {
            return list;
        }

        curr.next = list;
        int steps = length - k;

        ListNode tail = curr;

        while (steps-- > 0) {
            tail = tail.next;
        }

        ListNode newHead = tail.next;
        tail.next = null;

        return newHead;

    }
}
