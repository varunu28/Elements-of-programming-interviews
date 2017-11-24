import java.util.ArrayList;
import java.util.Stack;

public class StackWithMax {

    /*
    9.1
    */
    public int maxVal = Integer.MIN_VALUE;
    Stack<ArrayList<Integer>> stack = new Stack<>();

    public StackWithMax() {

    }

    public Integer max() {

        ArrayList<Integer> arrayList = stack.peek();
        return arrayList.get(1);

    }

    public Integer pop() {

        ArrayList<Integer> arrayList = stack.pop();
        return arrayList.get(0);

    }

    public void push(Integer x) {

        if (x > maxVal) {
            maxVal = x;
        }

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(x);
        arrayList.add(maxVal);

        stack.push(arrayList);
    }
}
