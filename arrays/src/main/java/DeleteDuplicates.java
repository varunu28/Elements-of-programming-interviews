import java.util.List;

public class DeleteDuplicates {

    /*
    6.5
    */

    public static int deleteDuplicates(List<Integer> A) {
        int slow = 0;
        int fast = 1;
        int n = A.size();

        while (fast < n) {
            if (A.get(fast) != A.get(fast-1)) {
                slow++;
                int temp = A.get(fast);
                A.set(slow, temp);
            }

            fast++;
        }

        int uniqueRange = slow+1;

        while (uniqueRange < n) {
            A.set(uniqueRange, null);
            uniqueRange++;
        }

        return slow + 1;
    }
}
