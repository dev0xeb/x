package Collections1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    Queue queue;

    @BeforeEach
    public void setUp() {
        queue = new Queue();
    }

    @Test
    public void testQueueIsEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testAddXCheckIfQueueIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testAddXRemoveXCheckIfQueueIsEmpty() {
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.remove();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testAddXYRemoveYCheckIfQueueIsNotEmpty() {
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        assertEquals("Clinton", queue.remove());
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testAddXYZCheckQueueIsFull(){
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        queue.add("Ayoade");
        assertTrue(queue.isFull());
    }

    @Test
    public void AddXYCheckThatQueueIsNotEmpty() {
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        assertFalse(queue.isFull());
    }

    @Test
    public void testAddMoreElementsThanQueueIsCapacity(){
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        queue.add("Ayoade");
        assertThrows(IllegalStateException.class, () ->{queue.add("Peter");});
    }

    @Test
    public void testRemoveFromEmptyQueue(){
        assertTrue(queue.isEmpty());
        assertThrows(IllegalStateException.class, () ->{queue.remove();});
    }

    @Test
    public void testPeekEmptyQueue(){
        assertTrue(queue.isEmpty());
        assertThrows(IllegalStateException.class, () -> {queue.peek();});
    }

    @Test
    public void testPeekTheHeadOfTheQueue(){
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        assertEquals(queue.peek(), "Clinton");
    }

    @Test
    public void testPeekAfterRemove(){
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        queue.remove();
        assertEquals(queue.peek(), "David");
    }

    @Test
    public void testRetrieveTheHeadOfTheQueue(){
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        queue.add("Ayoade");
        assertEquals(queue.retrieve(), "Clinton");
    }

    @Test
    public void testRetrieveFromAnEmptyQueue(){
        assertTrue(queue.isEmpty());
        assertThrows(IllegalStateException.class, () -> {queue.retrieve();});
    }

    @Test
    public void testInsertAnElementIntoTheQueue(){
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        assertTrue(queue.offer("Ayoade"));
    }

    @Test
    public void testInsertElementWhenQueueIsFull(){
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        queue.add("Ayoade");
        assertTrue(queue.isFull());
        assertFalse(queue.offer("Peter"));
    }

    @Test
    public void testRemoveAllElementsFromTheQueue(){
        assertTrue(queue.isEmpty());
        queue.add("Clinton");
        queue.add("David");
        queue.add("Ayoade");
        queue.remove();
        queue.remove();
        queue.remove();
        assertTrue(queue.isEmpty());
    }
}
