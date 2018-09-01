import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateRPNExpressions {

    /*
    9.2
    */

    public static Integer eval(String RPNExpression) {

        Deque<Integer> intermediateRes = new ArrayDeque<>();
        return intermediateRes.removeFirst();
    }
}
