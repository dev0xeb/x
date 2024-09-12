package Collections;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class  ArrayListTest {
    Arraylist arrayList;
    @BeforeEach
    public void startEveryTest_With_This() {
        arrayList = new Arraylist();
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void testCreateArrayList() {
        assertTrue(arrayList.isEmpty());
    }

    @Test
    public void addX_TestArraylist_IsNotEmpty(){
        assertTrue(arrayList.isEmpty());
        arrayList.add("Clinton");
        assertFalse(arrayList.isEmpty());
    }

    @Test
    public void addXY_TestArraylistSize_Is2(){
        arrayList.add("Clinton");
        arrayList.add("Ayoade");
        assertEquals(2, arrayList.size());
    }

    @Test
    public void addXY_RemoveY_SizeIs1(){
        arrayList.add("Clinton");
        arrayList.add("Ayoade");
        assertEquals(2, arrayList.size());
        arrayList.remove(1);
        assertEquals(1, arrayList.size());
    }

    @Test
    public void addXY_RemoveZ_ThrowException(){
        arrayList.add("Clinton");
        arrayList.add("Ayoade");
        assertEquals(2, arrayList.size());
        assertThrows(IndexOutOfBoundsException.class, () -> arrayList.remove(3));
    }

    @Test
    public void addXY_getX(){
        arrayList.add("Clinton");
        arrayList.add("Ayoade");
        assertEquals(2, arrayList.size());
        assertEquals("Clinton", arrayList.get(0));
    }

    @Test
    public void addXY_getZ_ThrowException(){
        arrayList.add("Clinton");
        arrayList.add("Ayoade");
        assertThrows(IndexOutOfBoundsException.class, () -> arrayList.get(3));
    }
}
