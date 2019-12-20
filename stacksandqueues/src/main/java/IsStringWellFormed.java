import java.util.Stack;

public class IsStringWellFormed {

    /*
    9.3
    */

  public static boolean isWellFormed(String s) {
    Stack<Character> stack = new Stack<>();
    String opening = "{([";
    String closing = "})]";
    for (char c : s.toCharArray()) {
      int openingIdx = opening.indexOf(c);
      if (openingIdx != -1) {
        stack.push(c);
      } else {
        if (stack.isEmpty()) {
          return false;
        }
        char popped = stack.pop();
        if (opening.indexOf(popped) != closing.indexOf(c)) {
          return false;
        }
      }
    }
    return stack.isEmpty();
  }
}
