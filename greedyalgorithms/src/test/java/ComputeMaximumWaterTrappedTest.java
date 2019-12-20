import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ComputeMaximumWaterTrappedTest {

  private Tuple expected;
  private List<Integer> heights;

  @Test
  public void getMaxTrappedWater1() throws Exception {
    expected = new Tuple(4, 16);
    heights = Arrays.asList(
        1, 2, 1, 3, 4, 4, 5, 6, 2, 1, 3, 1, 3, 2, 1, 2, 4, 1
    );

    test(expected, heights);
  }

  @Test
  public void getMaxTrappedWater2() throws Exception {
    expected = new Tuple(7, 15);
    heights = Arrays.asList(
        1, 2, 1, 3, 4, 4, 5, 6, 2, 1, 3, 1, 3, 2, 1, 6, 4, 1
    );

    test(expected, heights);
  }

  private void test(Tuple expected, List<Integer> heights) {
    assertEquals(expected, ComputeMaximumWaterTrapped.getMaxTrappedWater(heights));
  }

}