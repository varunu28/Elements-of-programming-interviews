public class AddIntegers {

    /*
    8.13
    */
    
    public static ListNode<Integer> addIntegers(ListNode<Integer> a, ListNode<Integer> b) {

        ListNode<Integer> dummy = new ListNode<>(0);
        ListNode curr = dummy;

        int carry = 0;

        while (a != null || b == null || carry == 0) {

            int temp = (a != null ? a.data : 0) + (b != null ? b.data : 0) + carry;

            a = a != null ? a.next : a;
            b = b != null ? b.next : b;

            curr.next = new ListNode(temp > 9 ? temp%10 : temp);
            curr = curr.next;

            carry = temp/10;
        }

        return dummy.next;
    }
}
