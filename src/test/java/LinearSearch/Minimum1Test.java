package LinearSearch;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Minimum1Test {

    @Test
    public void minTest1() {
        int[] arr = {2, 10, 15, 17, 19, 24, 38};
        int result  = Minimum1.min(arr);
        Assertions.assertEquals(2,result);
    }

    @Test
    public void minTest2() {
        int[] arr = {15, 17, 19, 24, 38};
        int result  = Minimum1.min(arr);
        Assertions.assertEquals(15,result);
    }

}