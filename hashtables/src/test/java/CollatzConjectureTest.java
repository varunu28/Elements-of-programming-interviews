import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CollatzConjectureTest {

  private boolean expected;
  private int n;

  @Test
  public void testCollatzConjecture() throws Exception {
    expected = true;
    n = 10000;

    test(expected, n);
  }

  private void test(boolean expected, int n) {
    assertEquals(expected, CollatzConjecture.testCollatzConjecture(n));
  }

}