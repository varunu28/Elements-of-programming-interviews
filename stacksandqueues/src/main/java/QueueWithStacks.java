import java.util.Stack;

public class QueueWithStacks {

    /*
    9.9
    */
    Stack<Integer> mainStack;
    Stack<Integer> backupStack;
    public QueueWithStacks() {
        mainStack = new Stack<>();
        backupStack = new Stack<>();
    }

    public void enqueue(Integer x) {
        mainStack.push(x);
    }

    public Integer dequeue() {
        if (mainStack.isEmpty()) {
            return -1;
        }
        while (!mainStack.isEmpty()) {
            backupStack.push(mainStack.pop());
        }
        int removed = backupStack.pop();
        while (!backupStack.isEmpty()) {
            mainStack.push(backupStack.pop());
        }
        return removed;
    }
}
