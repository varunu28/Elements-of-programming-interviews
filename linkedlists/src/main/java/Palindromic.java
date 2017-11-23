import java.util.ArrayList;

public class Palindromic {

    /*
    8.11
    */

    public static boolean isPalindromic(ListNode<Integer> list) {

        ListNode fast = list;
        ListNode slow = list;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        fast = list;
        slow = reverseLinkedList(slow);

        while (slow != null && fast != null) {

            if (fast.data != slow.data) {
                return false;
            }

            fast = fast.next;
            slow = slow.next;
        }

        return true;
    }

    private static ListNode reverseLinkedList(ListNode curr) {

        ListNode prev = null;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }

        return prev;
    }
}
