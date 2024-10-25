package dairy.data.repositories;

import dairy.data.models.Diary;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryRepositoryImplTest {
   DiaryRepositoryImpl repository = new DiaryRepositoryImpl();
    @BeforeEach
    public void setUp() {
        repository = new DiaryRepositoryImpl();
    }

    @Test
    public void newRepositioryCountIsZero() {
        assertEquals(0, repository.count());
//        long result = diary.count();
//        assertEquals(0, result);
    }

    @Test
    public void AddnewEntryRepositoryCountIsOne() {
        assertEquals(0, repository.count());
        repository.save(new Diary());
        assertEquals(1, repository.count());
    }

    @Test
    public void AddnewEntryRepositoryCountIsTwoFindById() {
        Diary diary = new Diary();
       diary.setUsername("clinton");
       assertEquals(0, repository.count());
       repository.save(diary);
       assertEquals(1, repository.count());
       Diary savedDiary = repository.findById("clinton");
       assertEquals("clinton", savedDiary.getUsername());
    }
}