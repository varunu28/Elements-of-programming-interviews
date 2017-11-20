public class ReverseSingleSublist {

    /*
    8.2
    */

    public static ListNode<Integer> reverseSublist(ListNode<Integer> input, int s, int f) {

        ListNode<Integer> empty = new ListNode<>(0, input);
        ListNode curr = empty;

        int k = 1;

        while (k++ < s) {
            curr = curr.next;
        }

        ListNode prev = curr.next;

        while (s++ < f) {
            ListNode temp = prev.next;
            prev.next = temp.next;
            temp.next = curr.next;
            curr.next = temp;
        }

        return empty.next;
    }
}
