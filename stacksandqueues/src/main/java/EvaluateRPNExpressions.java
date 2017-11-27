import java.util.ArrayDeque;
import java.util.Deque;

public class EvaluateRPNExpressions {

    /*
    9.2
    */

    public static Integer eval(String RPNExpression) {

        Deque<Integer> intermediateRes = new ArrayDeque<>();
        String[] splits = RPNExpression.split(",");

        for (String symbol : splits) {
            if (symbol.length() == 1 && "x/-+".contains(symbol)) {
                int a = intermediateRes.removeFirst();
                int b = intermediateRes.removeFirst();
                int res = 0;

                switch (symbol){
                    case "x":
                        res = a*b;
                        break;
                    case "+":
                        res = a+b;
                        break;
                    case "-":
                        res = a-b;
                        break;
                    case "/":
                        res = a/b;
                        break;
                    default:
                        break;
                }

                intermediateRes.addFirst(res);
            }
            else {
                intermediateRes.addFirst(Integer.parseInt(symbol));
            }
        }

        return intermediateRes.removeFirst();
    }
}
