public class RemoveDuplicatesFromSortedList {

    /*
    8.8
    */

    public static void removeDuplicates(ListNode<Integer> list) {

        ListNode curr = list;

        while (curr != null) {
            if (curr.next != null && curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }

}
