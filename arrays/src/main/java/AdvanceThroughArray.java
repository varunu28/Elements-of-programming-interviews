import java.util.List;

public class AdvanceThroughArray {

    /*
       6.4
    */

    public static boolean arrayAdvance(List<Integer> A) {
//        return arrayAdvanceImplRecursive(A, 0, A.size()-1, 0);
        return arrayAdvanceImplIterative(A);
    }

    private static boolean arrayAdvanceImplRecursive(List<Integer> a, int start, int end, int move) {

        if (start + move >= end) {
            return true;
        }

        int possibleMoves = a.get(start + move);
        int newStart = start + move;
        boolean isPossible = false;

        while (possibleMoves > 0) {
            isPossible = isPossible || arrayAdvanceImplRecursive(a, newStart, end, possibleMoves);
            possibleMoves--;
        }

        return isPossible;
    }

    private static boolean arrayAdvanceImplIterative(List<Integer> a) {
        int startIndex = 0;
        int endIndex = a.size()-1;

        for (int i=0; i <= startIndex && startIndex < endIndex; i++) {
            startIndex = Math.max(startIndex, i + a.get(i));
        }

        return startIndex >= endIndex;
    }
}
