import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class MultipleArbitraryPrecisionIntegersTest {

  List<Integer> expected;
  List<Integer> a;
  List<Integer> b;

  @Test
  public void multiply1() {
    expected = Arrays.asList(0);
    a = Arrays.asList(0);
    b = Arrays.asList(1, 1, 1);

    test(expected, a, b);
  }

  @Test
  public void multiply2() {
    expected = Arrays.asList(1, 4, 4);
    a = Arrays.asList(1, 2);
    b = Arrays.asList(1, 2);

    test(expected, a, b);
  }

  @Test
  public void multiply3() {
    expected = Arrays.asList(-1, 4, 7, 5, 7, 3, 9, 5, 2, 5, 8, 9, 6, 7, 6, 4, 1, 2, 9, 2, 7);
    a = Arrays.asList(1, 9, 3, 7, 0, 7, 7, 2, 1);
    b = Arrays.asList(-7, 6, 1, 8, 3, 8, 2, 5, 7, 2, 8, 7);

    test(expected, a, b);
  }

  @Test
  public void multiply4() {
    expected = Arrays.asList(8, 0, 0, 0, 0);
    a = Arrays.asList(4, 0, 0);
    b = Arrays.asList(2, 0, 0);

    test(expected, a, b);
  }

  @Test
  public void multiply5() {
    expected = Arrays.asList(1, 0, 1, 2, 3, 6, 7, 7, 9, 1);
    a = Arrays.asList(4, 3, 2, 4, 5, 1);
    b = Arrays.asList(2, 3, 4, 1);

    test(expected, a, b);
  }

  @Test
  public void multiply6() {
    expected = Arrays.asList(-2, 3, 6, 9, 0, 9, 2);
    a = Arrays.asList(1, 0, 1, 2);
    b = Arrays.asList(-2, 3, 4, 1);

    test(expected, a, b);
  }

  private void test(List<Integer> expected, List<Integer> a, List<Integer> b) {
    assertEquals(expected, MultipleArbitraryPrecisionIntegers.multiply(a, b));
  }

}