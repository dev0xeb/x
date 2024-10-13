package Collections1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StarkTest {
    Stack stark;

    @BeforeEach
    public void setUp() {
        stark = new Stack();
    }

    @Test
    public void testIfStarkIsEmpty() {
        assertTrue(stark.isEmpty());
    }

    @Test
    public void testpushX_CheckIfStackisEmpty(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        assertFalse(stark.isEmpty());
    }

    @Test
    public void testpushY_PopYCheckIfStackisEmpty(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        stark.pop();
        assertTrue(stark.isEmpty());
    }

    @Test
    public void testPushXY_PopYCheckStackIsNotEmpty(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        stark.push("Ayoade");
        stark.pop();
        assertFalse(stark.isEmpty());
    }

    @Test
    public void testPushXYZCheckStackIsFull(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        stark.push("Ayoade");
        stark.push("David");
        assertEquals(3, stark.capacity());
        assertTrue(stark.isFull());
    }

    @Test
    public void testPushXY_CheckStackIsNotFull(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        stark.push("Ayoade");
        assertFalse(stark.isFull());
    }
    @Test
    public void testPushMoreThanStackCapacity(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        stark.push("Ayoade");
        stark.push("David");
        assertThrows(IllegalStateException.class, () -> {stark.push("ayo");});
    }

    @Test
    public void testPopAnEmptyStack(){
        assertTrue(stark.isEmpty());
        assertThrows(IllegalStateException.class, () -> {stark.pop();});
    }

    @Test
    public void testPushXGetStackSize(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        assertEquals(1, stark.getSize());
    }

    @Test
    public void testPopAllElementsToSeeIfStackIsEmpty(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        stark.push("Ayoade");
        stark.push("David");
        assertEquals(3, stark.getSize());
        assertTrue(stark.isFull());
        stark.pop();
        stark.pop();
        stark.pop();
        assertTrue(stark.isEmpty());
    }

    @Test
    public void testStackCapacityIsConstant(){
        assertTrue(stark.isEmpty());
        assertEquals(3, stark.capacity());
        stark.push("Clinton");
        stark.push("Ayoade");
        assertEquals(2, stark.getSize());
        assertEquals(3, stark.capacity());
    }

    @Test
    public void testPushXYPopYPushZAndSizeIs2(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        stark.push("Ayoade");
        stark.pop();
        stark.push("David");
        assertEquals(2, stark.getSize());
    }

    @Test
    public void testStackCanPeekAtMostRecentElement(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        stark.push("Ayoade");
        assertEquals("Ayoade", stark.peek());
        stark.pop();
        assertEquals("Clinton", stark.peek());
    }

    @Test
    public void testPeekEmptyStack(){
        assertTrue(stark.isEmpty());
        assertThrows(IllegalStateException.class, () -> {stark.peek();});
    }

    @Test
    public void testStackCanReturnIndexOfSearchedElement(){
        assertTrue(stark.isEmpty());
        stark.push("Clinton");
        stark.push("Ayoade");
        stark.push("David");
        assertEquals(0, stark.search("Clinton"));
        assertEquals(1, stark.search("Ayoade"));
    }

    @Test
    public void testSearchEmptyStack(){
        assertTrue(stark.isEmpty());
        assertThrows(IllegalStateException.class, () -> {stark.search("Clinton");});
    }
}