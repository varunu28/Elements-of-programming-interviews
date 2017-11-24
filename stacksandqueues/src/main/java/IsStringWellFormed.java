import java.util.Stack;

public class IsStringWellFormed {

    /*
    9.3
    */

    public static boolean isWellFormed(String s) {

        String start = "{[(";
        String end = "}])";

        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {

            if (start.indexOf(c) != -1) {
                stack.push(c);
            }
            else {
                char poppedChar = stack.pop();
                if (start.indexOf(poppedChar) != end.indexOf(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
