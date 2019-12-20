import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class MaximumCoinsGainTest {

  private int expected;
  private List<Integer> coins;

  private static void test(int expected, List<Integer> coins) {
    assertEquals(expected, MaximumCoinsGain.computeMaximum(coins));
  }

  @Test
  public void computeMaximum1() throws Exception {
    expected = 5;
    coins = Arrays.asList(1, 5);

    test(expected, coins);
  }

  @Test
  public void computeMaximum2() throws Exception {
    expected = 15;
    coins = Arrays.asList(5, 1, 10, 5);

    test(expected, coins);
  }

  @Test
  public void computeMaximum3() throws Exception {
    expected = 31;
    coins = Arrays.asList(10, 25, 5, 1, 10, 5);

    test(expected, coins);
  }

}