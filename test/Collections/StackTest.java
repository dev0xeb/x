package Collections;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StackTest {
    Stack stack;

    @BeforeEach
    public void startTestWithThis() {
        stack = new Stack();
    }

    @Test
    public void testThereisaStack_isEmpty() {
        Assertions.assertTrue(stack.isEmpty());
    }


    @Test
    public void pushX_StackIsNotEmpty() {
        Assertions.assertTrue(stack.isEmpty());
        stack.push("Clinton");
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    public void pushX_popXStackIsEmpty() {
        Assertions.assertTrue(stack.isEmpty());
        stack.push("Clinton");
        stack.pop();
        Assertions.assertTrue(stack.isEmpty());
    }

    @Test
    public void pushXY_popXStackIsNotEmpty() {
        Assertions.assertTrue(stack.isEmpty());
        stack.push("Clinton");
        stack.push("Ayoade");
        stack.pop();
        Assertions.assertFalse(stack.isEmpty());
    }

    @Test
    public void pushXYZ_StackIsFull() {
        Assertions.assertTrue(stack.isEmpty());
        stack.push("Clinton");
        stack.push("Ayoade");
        stack.push("David");
        Assertions.assertEquals(3, stack.Capacity());
        Assertions.assertTrue(stack.isFull());
    }

    @Test
    public void pushXY_StackIsNotFull() {
        Assertions.assertTrue(stack.isEmpty());
        stack.push("Clinton");
        stack.push("Ayoade");
        Assertions.assertFalse(stack.isFull());
    }
}
