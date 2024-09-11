package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ReverseListTest {
    @Test
    public void testReverseList() {
        int[] num1 = {1, 2, 3, 4, 5};
        int[] expected1 = {5, 4, 3, 2, 1};

        int[] result = ReverseList.reversealist(num1);
        assertArrayEquals(expected1, result);
    }

    @Test
    public void testReverseList2() {
        int[] num1 = {4, 5, 2, 1, 6};
        int[] expected1 = {6, 1, 2, 5, 4};

        int[] result = ReverseList.reversealist(num1);
        assertArrayEquals(expected1, result);
    }
}
