import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class DutchNationalFlagTest {

    private Integer pivot;
    private List<Integer> unordered;
    private List<Integer> ordered;

    @Test
    public void dutchNationalFlag1() {
        pivot = 0;
        unordered = Arrays.asList(1);
        ordered = Arrays.asList(1);

        test(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlag2() {
        pivot = 3;
        unordered = Arrays.asList(0, 1, 2, 0, 2, 1, 1);
        ordered = Arrays.asList(0, 0, 1, 2, 2, 1, 1);

        test(pivot, unordered, ordered);
    }

    @Test
    public void dutchNationalFlag3() {
        pivot = 2;
        unordered = Arrays.asList(0, 1, 2, 0, 2, 1, 1);
        ordered = Arrays.asList(0, 1, 0, 1, 1, 2, 2);

        test(pivot, unordered, ordered);
    }

    private void test(Integer pivot, List<Integer> unordered, List<Integer> ordered) {
        DutchNationalFlag.dutchNationalFlag(pivot, unordered);
        assertEquals(ordered,unordered);
    }

}