package Collections1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SetTest {
    Set set;

    @BeforeEach
    public void setUp() {
        set = new Set(3);
    }

    @Test
    public void testSetIsEmpty() {
        assertTrue(set.isEmpty());
    }

    @Test
    public void testAddACheckSetIsNotEmpty() {
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertFalse(set.isEmpty());
    }

    @Test
    public void testAddARemoveACheckSetIsEmpty() {
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertTrue(set.remove("Clinton"));
        assertTrue(set.isEmpty());
    }

    @Test
    public void testAddABRemoveBCheckSetIsNotEmpty() {
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertTrue(set.add("David"));
        assertTrue(set.remove("Clinton"));
        assertFalse(set.isEmpty());
    }

    @Test
    public void testAddToAFullSet(){
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertTrue(set.add("David"));
        assertTrue(set.add("Peter"));
        assertTrue(set.isFull());
        assertThrows(IllegalStateException.class, ()->{set.add("Ayoade");});
    }

    @Test
    public void testRemoveFromEmptySet() {
        assertTrue(set.isEmpty());
        assertThrows(IllegalStateException.class, () -> set.remove("Clinton"));
    }

    @Test
    public void testCheckIfARemovedElementStillExistsInSet(){
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertTrue(set.add("David"));
        assertTrue(set.add("Peter"));
        assertTrue(set.remove("Clinton"));
        assertFalse(set.contains("Clinton"));
        assertTrue(set.remove("David"));
        assertFalse(set.contains("David"));
    }

    @Test
    public void testRemoveElementsThatDoesNotExistInSet(){
        assertTrue(set.isEmpty());
        set.add("Clinton");
        set.add("David");
        assertFalse(set.remove("Peter"));
    }

    @Test
    public void testCheckIfSetCanTakeDuplicate(){
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertThrows(IllegalStateException.class, () -> set.add("Clinton"));
    }

    @Test
    public void testCheckAddMoreThanSetCapacity(){
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertTrue(set.add("David"));
        assertTrue(set.add("Peter"));
        assertThrows(IllegalStateException.class, () -> set.add("Ayoade"));
    }

    @Test
    public void testCheckSetCurrentSize(){
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertTrue(set.add("David"));
        assertTrue(set.add("Peter"));
        assertEquals(3, set.getSize());
    }

    @Test
    void testSetContainsAPacticularElement(){
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertTrue(set.add("David"));
        assertTrue(set.add("Peter"));
        assertTrue(set.contains("Clinton"));
    }

    @Test
    public void testToSeeIfSetContainsAnElementWhenEmpty(){
        assertTrue(set.isEmpty());
        assertThrows(IllegalStateException.class, () -> set.contains("Clinton"));
    }

    @Test
    public void testToCheckSetDoesNotDoesNotContainAnElement(){
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertTrue(set.add("David"));
        assertTrue(set.add("Peter"));
        assertFalse(set.contains("Ayoade"));
    }

    @Test
    public void testClearAllElementsInASet(){
        assertTrue(set.isEmpty());
        assertTrue(set.add("Clinton"));
        assertTrue(set.add("David"));
        assertTrue(set.add("Peter"));
        assertTrue(set.isFull());
        set.clear();
        assertTrue(set.isEmpty());
        assertEquals(0, set.getSize());
    }

    @Test
    public void testClearOnEmptySet(){
        assertTrue(set.isEmpty());
        set.clear();
        assertTrue(set.isEmpty());
        assertEquals(0, set.getSize());
    }

}