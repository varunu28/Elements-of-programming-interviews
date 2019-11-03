import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueWithMax {

    /*
    9.10
    */

    Queue<Integer> queue;
    Deque<Integer> maxQueue;
    public QueueWithMax() {
        queue = new LinkedList<>();
        maxQueue = new LinkedList<>();
    }

    public void enqueue(Integer x) {
        queue.add(x);
        while (!maxQueue.isEmpty() && maxQueue.peekLast() < x) {
            maxQueue.removeLast();
        }
        maxQueue.addLast(x);
    }

    public Integer dequeue() {
        if (queue.isEmpty()) {
            return -1;
        }
        int removed = queue.remove();
        if (removed == maxQueue.peekFirst()) {
            maxQueue.removeFirst();
        }
        return removed;
    }

    public Integer max() {
        if (maxQueue.isEmpty()) {
            return -1;
        }
        return maxQueue.peekFirst();
    }
}
