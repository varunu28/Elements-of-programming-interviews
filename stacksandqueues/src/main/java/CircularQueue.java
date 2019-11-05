import java.util.Arrays;

public class CircularQueue {

    /*
    9.8
    */

    private int head;
    private int tail;
    private int capacity;
    private int[] entries;

    public CircularQueue(int capacity) {
        head = 0;
        tail = 0;
        this.capacity = capacity;
        entries = new int[this.capacity];
        Arrays.fill(entries, -1);
    }

    public void enqueue(Integer x) {
        if ((tail + 1 <= capacity && tail + 1 == head) || (tail + 1 > capacity && head == 0)) {
            return;
        }
        entries[tail++] = x;
    }

    public Integer dequeue() {
        if (entries[head] == -1) {
            return -1;
        }
        int removed = entries[head];
        entries[head++] = -1;
        return removed;
    }

    public int size() {
        return tail - head;
    }
}
