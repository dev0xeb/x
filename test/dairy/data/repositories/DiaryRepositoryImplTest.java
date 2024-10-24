package dairy.data.repositories;

import dairy.data.models.Diary;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryRepositoryImplTest {
    @Test
    public void newRepositioryCountIsZero() {
        DiaryRepositoryImpl diary = new DiaryRepositoryImpl();
        assertEquals(0, diary.count());
//        long result = diary.count();
//        assertEquals(0, result);
    }

    @Test
    public void AddnewEntryRepositoryCountIsOne() {
        DiaryRepositoryImpl diary = new DiaryRepositoryImpl();
        assertEquals(0, diary.count());
        diary.save(new Diary());
        assertEquals(1, diary.count());
    }

}