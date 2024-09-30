package LinearSearch;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LinearSearch1Test {

    @Test
    public void linearSearchTest1() {
        int[] arr = {20, 32, 42, 48, 70, 81};
        int key = 20;
        int result = LinearSearch1.linearSearch(arr, key);
        Assertions.assertEquals(0, result);
    }

    @Test
    public void linearSearchTest2() {
        int[] arr = {20, 32, 42, 48, 70, 81};
        int key = 32;
        int result = LinearSearch1.linearSearch(arr, key);
        Assertions.assertEquals(1, result);
    }
}