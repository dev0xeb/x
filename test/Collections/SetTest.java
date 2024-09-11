package Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SetTest {
    Sets set;

    @BeforeEach
    public void startEveryTestWith() {
        set  = new Sets();
        assertTrue(set.isEmpty());
    }

    @Test
    public void createASet_CheckIfSetIsEmpty() {
        assertTrue(set.isEmpty());
    }

    @Test
    public void addX_CheckIfSetIsNotEmpty() {
        set.add("Clinton");
        assertFalse(set.isEmpty());
    }
    

    @Test
    public void addXY_CheckSizeOfSet () {
        set.add("Clinton");
        set.add("Ayoade");
        assertEquals(2, set.size());
    }

    @Test
    public void addXX_setSizeShouldBe1() {
        set.add("Clinton");
        set.add("Clinton");
        assertEquals(1, set.size());
    }

    @Test
    public void addX_RemoveX_setShouldBeEmpty() {
        set.add("Clinton");
        set.remove("Clinton");
        assertTrue(set.isEmpty());
    }

    @Test
    public void addXY_removeX_setSizeShouldBe1() {
        set.add("Clinton");
        set.add("Ayoade");
        set.remove("Clinton");
        assertEquals(1, set.size());
    }
    @Test
    public void addXY_ChectIfSetContainsX(){
        set.add("Clinton");
        set.add("Ayoade");
        assertTrue(set.contain("Clinton"));
    }
    @Test
    public void addXY_removeZ_setShouldBeEmpty() {
        set.add("Clinton");
        set.add("Ayoade");
        set.remove("Ayomide");
        assertFalse(set.contain("Ayomide"));
    }

    public void addXY_clear_setShouldBeEmpty() {
        set.add("Clinton");
        set.add("Ayoade");
        set.clear();
        assertTrue(set.isEmpty());
    }
}
