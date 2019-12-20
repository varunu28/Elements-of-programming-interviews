import java.util.Stack;

public class StackWithMax {

  /*
  9.1
  */
  Stack<Integer> stack;
  Stack<Integer> maxStack;

  public StackWithMax() {
    stack = new Stack<>();
    maxStack = new Stack<>();
  }

  public Integer max() {
    if (!maxStack.isEmpty()) {
      return maxStack.peek();
    }
    return -1;
  }

  public Integer pop() {
    if (stack.isEmpty()) {
      return -1;
    }
    int popped = stack.pop();
    maxStack.pop();
    return popped;
  }

  public void push(Integer x) {
    stack.push(x);
    if (maxStack.isEmpty()) {
      maxStack.push(x);
    } else {
      maxStack.push(Math.max(maxStack.peek(), x));
    }
  }
}
