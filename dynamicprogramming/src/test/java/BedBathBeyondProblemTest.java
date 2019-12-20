import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.junit.Test;

public class BedBathBeyondProblemTest {

  private List<String> expected;
  private String domain;
  private Set<String> dictionary;

  private static void test(List<String> expected, String domain, Set<String> dictionary) {
    assertEquals(expected, BedBathBeyondProblem.decompose(domain, dictionary));
  }

  @Test
  public void decompose1() throws Exception {
    expected = Arrays.asList(
        "a",
        "man",
        "a",
        "plan",
        "a",
        "canal"
    );
    domain = "amanaplanacanal";
    dictionary = new HashSet<>(Arrays.asList(
        "a",
        "man",
        "plan",
        "canal"
    ));

    test(expected, domain, dictionary);
  }

}