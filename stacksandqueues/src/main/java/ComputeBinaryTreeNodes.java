import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ComputeBinaryTreeNodes {

    /*
    9.7
    */

  public static List<List<Integer>> binaryTreeDepthOrder(BinaryTree<Integer> tree) {
    List<List<Integer>> ans = new ArrayList<>();
    if (tree == null) {
      return ans;
    }
    Queue<BinaryTree<Integer>> queue = new LinkedList<>();
    queue.add(tree);
    while (!queue.isEmpty()) {
      List<Integer> temp = new ArrayList<>();
      int size = queue.size();
      while (size-- > 0) {
        BinaryTree<Integer> removed = queue.remove();
        temp.add(removed.data);
        if (removed.left != null) {
          queue.add(removed.left);
        }
        if (removed.right != null) {
          queue.add(removed.right);
        }
      }
      ans.add(temp);
    }
    return ans;
  }
}
