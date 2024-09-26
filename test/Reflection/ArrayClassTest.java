package Reflection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayClassTest {
    ArrayClass array = new ArrayClass();

    @Test
    public void test() {
        assertEquals(array.getClass(), ArrayClass.class);
    }

    @Test
    public void replaceElement(){
        int[][] number = {{1,1,0}, {0,1,0}, {1,1,0}};
        String[][] expected = {{"*", "*", " "}, {" ", "*", " "}, {"*", "*", " "}};
        assertArrayEquals(expected, ArrayClass.replaceValues(number));
    }
}