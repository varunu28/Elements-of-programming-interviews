public class MergeSortedLists {

    /*
    8.1
    */

    public static ListNode<Integer> mergeLists(ListNode<Integer> list1, ListNode<Integer> list2) {

        ListNode<Integer> empty = new ListNode<>(0);
        ListNode curr = empty;

        while (list1 != null && list2 != null) {
            if (list1.data < list2.data) {
                curr.next = list1;
                list1 = list1.next;
            }
            else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        while (list1 != null) {
            curr.next = list1;
            list1 = list1.next;
            curr = curr.next;
        }

        while (list2 != null) {
            curr.next = list2;
            list2 = list2.next;
            curr = curr.next;
        }

        return empty.next;
    }
}
