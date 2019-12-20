import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class EvaluateRPNExpressions {

    /*
    9.2
    */

  public static Integer eval(String RPNExpression) {
    String[] values = RPNExpression.split(",");
    Stack<Integer> stack = new Stack<>();
    Set<String> operations = new HashSet<>(Arrays.asList("-", "+", "/", "x"));
    for (String value : values) {
      stack.push(
          operations.contains(value) ? solveExpression(
              stack.pop(), stack.pop(), value
          ) : Integer.parseInt(value)
      );
    }
    return stack.pop();
  }

  private static Integer solveExpression(Integer num2, Integer num1, String oper) {
    if (oper.equals("+")) {
      return num1 + num2;
    } else if (oper.equals("-")) {
      return num1 - num2;
    } else if (oper.equals("x")) {
      return num1 * num2;
    } else {
      return num1 / num2;
    }
  }
}
