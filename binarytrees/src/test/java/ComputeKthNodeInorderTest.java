import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ComputeKthNodeInorderTest {

  private static BinaryTree<Integer> tree;

  static {
    tree = new BinaryTree<>(5);
    tree.left = new BinaryTree<>(2);
    tree.left.left = new BinaryTree<>(1);
    tree.right = new BinaryTree<>(2);
    tree.right.left = new BinaryTree<>(1);
  }

  private BinaryTree<Integer> expected;
  private int k;

  @Test
  public void findKthNodeBinaryTree1() throws Exception {
    k = 0;
    expected = tree.left.left;

    test(expected, k);
  }

  @Test
  public void findKthNodeBinaryTree2() throws Exception {
    k = 1;
    expected = tree.left;

    test(expected, k);
  }

  @Test
  public void findKthNodeBinaryTree3() throws Exception {
    k = 2;
    expected = tree;

    test(expected, k);
  }

  @Test
  public void findKthNodeBinaryTree4() throws Exception {
    k = 3;
    expected = tree.right.left;

    test(expected, k);
  }

  @Test
  public void findKthNodeBinaryTree5() throws Exception {
    k = 4;
    expected = tree.right;

    test(expected, k);
  }

  private void test(BinaryTree<Integer> expected, int k) {
    assertEquals(expected, ComputeKthNodeInorder.findKthNodeBinaryTree(tree, k));
  }

}