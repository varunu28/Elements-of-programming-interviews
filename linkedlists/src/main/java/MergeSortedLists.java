public class MergeSortedLists {

    /*
    8.1
    */

    public static ListNode<Integer> mergeLists(ListNode<Integer> list1, ListNode<Integer> list2) {
        ListNode<Integer> ans = new ListNode<>(-1);
        ListNode<Integer> curr = ans;

        while (list1 != null || list2 != null) {
            if (list1 != null && list2 != null) {
                if (list1.data < list2.data) {
                    curr.next = new ListNode<>(list1.data);
                    list1 = list1.next;
                }
                else {
                    curr.next = new ListNode<>(list2.data);
                    list2 = list2.next;
                }
            }
            else if (list1 != null) {
                curr.next = new ListNode<>(list1.data);
                list1 = list1.next;
            }
            else {
                curr.next = new ListNode<>(list2.data);
                list2 = list2.next;
            }

            curr = curr.next;
        }

        return ans.next;
    }
}
