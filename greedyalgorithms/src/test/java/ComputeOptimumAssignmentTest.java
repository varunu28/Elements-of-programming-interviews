import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class ComputeOptimumAssignmentTest {

  private List<Tuple> expected;
  private List<Integer> taskDurations;

  @Test
  public void optimumTaskAssignment1() throws Exception {
    expected = Arrays.asList(
        new Tuple(2, 5),
        new Tuple(1, 6),
        new Tuple(4, 4)
    );
    taskDurations = Arrays.asList(1, 2, 4, 4, 5, 6);

    test(expected, taskDurations);
  }

  private void test(List<Tuple> expected, List<Integer> taskDurations) {
    assertEquals(expected, ComputeOptimumAssignment.optimumTaskAssignment(taskDurations));
  }

}