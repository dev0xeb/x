package dairy.data.repositories;

import dairy.data.models.Diary;
import dairy.data.models.Entry;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryRepositoryImplTest {
    DiaryRepositoryImpl diaryRepository = new DiaryRepositoryImpl();
    @BeforeEach
    public void setUp() {
        diaryRepository = new DiaryRepositoryImpl();
    }

    @Test
    public void testNewRepositoryIsEmpty() {
        assertEquals(0, diaryRepository.count());
    }

    @Test
    public void testAddDiaryRepositoryIsNotEmpty() {
        assertEquals(0, diaryRepository.count());
        Diary diary = new Diary("clinton", "password");
        diaryRepository.save(diary);
        assertEquals(1, diaryRepository.count());
    }

    @Test
    public void testAdd2DiaryRepositoryIsNotEmpty() {
        assertEquals(0, diaryRepository.count());
        Diary diary = new Diary("clinton", "password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary("david", "password");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
    }

    @Test
    public void testAdd2RepositoryDelete1RepositoryIsNotEmpty() {
        assertEquals(0, diaryRepository.count());
        Diary diary = new Diary("clinton", "password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary("david", "password");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
        diaryRepository.delete(diary2);
        assertEquals(1, diaryRepository.count());
    }

    @Test
    public void testSearchForDeletedDiary() {
        assertEquals(0, diaryRepository.count());
        Diary diary = new Diary("clinton", "password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary("david", "password");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
        diaryRepository.delete(diary2);
        assertEquals(1, diaryRepository.count());
        assertNull(diaryRepository.findById("david"));
    }

    @Test
    public void DiaryCanGetRepositoryUsername() {
        assertEquals(0, diaryRepository.count());
        Diary diary = new Diary("clinton", "password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary("david", "password");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
        assertEquals("david", diary2.getUsername());
        assertEquals("clinton", diary.getUsername());
    }

    @Test
    public void testSearchEntryById(){
        assertEquals(0, diaryRepository.count());
        Diary diary = new Diary("clinton", "password");
        diaryRepository.save(diary);
        Diary diary2 = new Diary("david", "password");
        diaryRepository.save(diary2);
        assertEquals(2, diaryRepository.count());
        assertEquals("david", diary2.getUsername());
    }

//    @Test
//    public void testDeleteById(){
//        assertEquals(0, diaryRepository.count());
//        Diary diary = new Diary("clinton", "password");
//
//    }

    @Test
    public void testForNonExistentDiary() {
        assertEquals(0, diaryRepository.count());
        Diary diary = new Diary("clinton", "password");
        diaryRepository.save(diary);
        assertNull(diaryRepository.findById("veekee"));
    }
}