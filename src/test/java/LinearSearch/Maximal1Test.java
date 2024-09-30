package LinearSearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Maximal1Test {

    @Test
    public void maxTest1() {
        int[] arr = {2, 10, 24, 28, 30};
        int result = Maximal1.max(arr);
        Assertions.assertEquals(30, result);
    }

    @Test
    public void maxTest2() {
        int[] arr = {2, 10, 24, 28};
        int result = Maximal1.max(arr);
        Assertions.assertEquals(28, result);
    }
}