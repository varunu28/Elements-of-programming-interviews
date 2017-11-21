public class DeleteKthLastNode {

    /*
    8.7
    */

    public static void deleteNode(ListNode<Integer> list, int k) {
        ListNode curr = list;
        int l = 0;

        while (curr != null) {
            curr = curr.next;
            l++;
        }

        curr = list;
        int c = 1;
        int target = l - k;

        while (c < target) {
            curr = curr.next;
            c++;
        }

        curr.next = curr.next.next;
    }

}
