import java.util.Arrays;
import java.util.List;

public class PermuteElements {

    /*
    6.9
    */

    public static void applyPermutation(List<Integer> perm, List<Integer> a) {
        int[] arr = new int[a.size()];
        for (int i = 0; i < perm.size(); i++) {
            arr[i] = a.get(perm.get(i));
        }
        for (int i = 0; i < a.size(); i++) {
            a.set(i, arr[i]);
        }
    }
}
