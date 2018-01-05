import java.util.List;

public class DeleteDuplicates {

    /*
    6.5
    */

    public static int deleteDuplicates(List<Integer> A) {

        if (A.isEmpty()) return 0;

        int idx = 1;

        for (int i=1; i<A.size(); ++i) {
            if (!A.get(idx-1).equals(A.get(i))) {
                A.set(idx++, A.get(i));
            }
        }

        for (int i=idx;i<A.size();i++) {
            A.set(i, null);
        }

        return idx;
    }
}
