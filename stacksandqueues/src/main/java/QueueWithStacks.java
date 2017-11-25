import java.util.Stack;

public class QueueWithStacks {

    /*
    9.9
    */
    Stack<Integer> oldStack = new Stack();
    Stack<Integer> newStack = new Stack<>();

    public QueueWithStacks() {
    }

    public void enqueue(Integer x) {

        while (!newStack.isEmpty()) {
            oldStack.push(newStack.pop());
        }

        oldStack.push(x);

    }

    public Integer dequeue() {

        while (!oldStack.isEmpty()) {
            newStack.push(oldStack.pop());
        }

        return newStack.pop();
    }
}
