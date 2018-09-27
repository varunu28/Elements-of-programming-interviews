import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class AdvanceThroughArrayTest {

    private List<Integer> array;
    private boolean possible;

    @Test
    public void arrayAdvance1() {
        array = Arrays.asList(1,2,0,0);
        possible = true;

        test(array, possible);
    }

    @Test
    public void arrayAdvance2() {
        array = Arrays.asList(3,3,1,0,2,0,1);
        possible = true;

        test(array, possible);
    }

    @Test
    public void arrayAdvance3() {
        array = Arrays.asList(1);;
        possible = true;

        test(array, possible);
    }

    private void test(List<Integer> array, boolean possible) {
        assertEquals(AdvanceThroughArray.arrayAdvance(array), possible);
    }

}