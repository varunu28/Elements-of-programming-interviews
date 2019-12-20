import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CloneAGraphTest {

  private GraphVertex expected;
  private GraphVertex G;

  @Test
  public void cloneGraph1() throws Exception {
    GraphVertex a = new GraphVertex(0);
    GraphVertex b = new GraphVertex(1);
    GraphVertex c = new GraphVertex(2);
    GraphVertex d = new GraphVertex(3);
    a.edges.add(b);
    a.edges.add(c);
    b.edges.add(c);
    b.edges.add(d);

    expected = a;
    G = a;

    test(expected, G);
  }

  private void test(GraphVertex expected, GraphVertex G) {
    assertEquals(expected, CloneAGraph.cloneGraph(G));
  }

}