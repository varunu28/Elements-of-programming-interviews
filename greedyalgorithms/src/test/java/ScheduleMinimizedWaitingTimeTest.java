import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ScheduleMinimizedWaitingTimeTest {

  private int expected;
  private List<Integer> serviceTime;

  @Test
  public void minimumTotalWaitingTime1() throws Exception {
    expected = 10;
    serviceTime = Arrays.asList(2, 5, 1, 3);

    test(expected, serviceTime);
  }

  private void test(int expected, List<Integer> serviceTime) {
    assertEquals(expected, ScheduleMinimizedWaitingTime.minimumTotalWaitingTime(serviceTime));
  }

}