import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class FindKthLargestTest {

  private int expected;
  private List<Integer> list;
  private int k;

  @Test
  public void findKth1() throws Exception {
    expected = 5;
    list = Arrays.asList(3, 2, 1, 5, 4);
    k = 1;

    test(expected, list, k);
  }

  @Test
  public void findKth2() throws Exception {
    expected = 3;
    list = Arrays.asList(3, 2, 1, 5, 4);
    k = 3;

    test(expected, list, k);
  }

  @Test
  public void findKth3() throws Exception {
    expected = 1;
    list = Arrays.asList(3, 2, 1, 5, 4);
    k = 5;

    test(expected, list, k);
  }

  private void test(int expected, List<Integer> list, int k) {
    assertEquals(expected, FindKthLargest.findKth(list, k));
  }
}