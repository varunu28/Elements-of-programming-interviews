import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CircularQueue {

    /*
    9.8
    */

    private int head;
    private int tail;
    private int capacity;
    private int[] entries;
    private int numberOfElements;
    private final int SCALE_FACTOR = 2;

    public CircularQueue(int capacity) {
        head = 0;
        tail = 0;
        numberOfElements = 0;
        this.capacity = capacity;
        entries = new int[this.capacity];
    }

    public void enqueue(Integer x) {
        if (numberOfElements == entries.length) {
            Collections.rotate(Arrays.asList(entries), -head);
            head = 0;
            tail = numberOfElements;
            entries = Arrays.copyOf(entries, numberOfElements * SCALE_FACTOR);
        }
        entries[tail] = x;
        tail = (tail + 1) % entries.length;
        numberOfElements++;
    }

    public Integer dequeue() {
        if (numberOfElements == 0) {
            return -1;
        }
        int removed = entries[head];
        head = (head + 1) % entries.length;
        numberOfElements--;
        return removed;
    }

    public int size() {
        return numberOfElements;
    }
}
