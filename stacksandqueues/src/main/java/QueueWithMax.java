import java.util.ArrayList;
import java.util.Stack;

public class QueueWithMax {

    /*
    9.10
    */

    Stack<ArrayList<Integer>> oldStack = new Stack();
    Stack<ArrayList<Integer>> newStack = new Stack<>();

    int maxVal = Integer.MIN_VALUE;

    public QueueWithMax() {
    }

    public void enqueue(Integer x) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (!newStack.isEmpty()) {
            oldStack.push(newStack.pop());
        }

        if (x > maxVal) {
            maxVal = x;
        }

        arrayList.add(x);
        arrayList.add(maxVal);
        oldStack.push(arrayList);

    }

    public Integer dequeue() {

        while (!oldStack.isEmpty()) {
            newStack.push(oldStack.pop());
        }

        return newStack.pop().get(0);
    }

    public Integer max() {

        while (!newStack.isEmpty()) {
            oldStack.push(newStack.pop());
        }

        return oldStack.peek().get(1);
    }

}
