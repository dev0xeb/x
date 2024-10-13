package Collections1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayListTest {
    ArrayList list;

    @BeforeEach
    void setUp() {
        list = new ArrayList();
    }

    @Test
    public void testIfListIsEmpty() {
        assertTrue(list.isEmpty());
    }

    @Test
    public void testAddACheckIfListIsEmpty() {
        assertTrue(list.isEmpty());
        list.add(0, "Clinton");
        assertFalse(list.isEmpty());
    }

    @Test
    public void testAddAnElementAtTheEndOfTheListCheckIfListIsEmpty() {
        assertTrue(list.isEmpty());
        list.add(0, "Clinton");
        list.add(1, "David");
        list.add(2, "Emily");
        assertTrue(list.addAtEnd("Peter"));
        assertFalse(list.isEmpty());
    }

    @Test
    public void testAddABCRemoveElementAtIndex1AndCheckSize(){
        assertTrue(list.isEmpty());
        list.add(0, "Clinton");
        list.add(1, "David");
        list.add(2, "Emily");
        list.removeByIndex(1);
        assertEquals(list.getSize(), 2);
    }

    @Test
    public void testAddABCRemoveElementByContentAndCheckSize(){
        assertTrue(list.isEmpty());
        list.add(0, "Clinton");
        list.add(1, "David");
        list.add(2, "Emily");
        assertTrue(list.removeByElement("Emily"));
    }

    @Test
    public void testRemoveByIndexOnAnEmptyList() {
        assertTrue(list.isEmpty());
        assertThrows(IllegalStateException.class, () -> list.removeByIndex(0));
    }

    @Test
    public void testRemoveByElementOnAnEmptyList() {
        assertTrue(list.isEmpty());
        assertThrows(IllegalStateException.class, () -> list.removeByElement("Clinton"));
    }

    @Test
    public void testIfListContainsAnElement(){
        assertTrue(list.isEmpty());
        list.add(0, "Clinton");
        list.add(1, "David");
        list.add(2, "Emily");
        assertTrue(list.contains("Clinton"));
    }

    @Test
    public void testContainOnEmptyList(){
        assertTrue(list.isEmpty());
        assertThrows(IllegalStateException.class, () -> list.contains("Clinton"));
    }

    @Test
    public void testAddMoreThanListCapacity(){
        assertTrue(list.isEmpty());
        list.add(0, "Clinton");
        list.add(1, "David");
        assertTrue(list.addAtEnd("Emily"));
        assertThrows(IndexOutOfBoundsException.class, () -> list.add(3, "Peter"));
    }

    @Test
    public void testGetElementsByIndex(){
        assertTrue(list.isEmpty());
        list.add(0, "Clinton");
        list.add(1, "David");
        list.add(2, "Emily");
        assertEquals("Emily", list.get(2));
    }

    @Test
    public void testCheckGetOnEmptyList(){
        assertTrue(list.isEmpty());
        assertThrows(IllegalStateException.class, () -> list.get(0));
    }

    @Test
    public void testRemoveAnElementThatDoesNotExist(){
        assertTrue(list.isEmpty());
        list.add(0, "Clinton");
        list.add(1, "David");
        list.add(2, "Emily");
        assertFalse(list.removeByElement("Peter"));
    }

    @Test
    public void testClearAllElementsInTheList(){
        assertTrue(list.isEmpty());
        list.add(0, "Clinton");
        list.add(1, "David");
        list.add(2, "Emily");
        assertEquals(3, list.getSize());
        list.clear();
        assertTrue(list.isEmpty());
        assertEquals(0, list.getSize());
    }

    @Test
    public void testGetAnElementAtNegativeIndex(){
        assertTrue(list.isEmpty());
        assertThrows(IllegalStateException.class, () -> list.get(-1));
    }

}