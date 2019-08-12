import java.util.List;

public class DeleteDuplicates {

    /*
    6.5
    */

    public static int deleteDuplicates(List<Integer> A) {
        int slow = 0;
        int fast = 0;
        int n = A.size();

        while (fast < n) {
            int val = A.get(fast);
            while (fast < n && A.get(fast) == val) {
                fast++;
            }
            A.set(slow++, val);
        }

        int curr = slow;
        while (curr < n) {
            A.set(curr++, null);
        }

        return slow;
    }
}
