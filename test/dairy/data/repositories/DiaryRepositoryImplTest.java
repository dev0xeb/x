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
        Diary diary = new Diary("clinton", "password");
       assertEquals(0, repository.count());
       repository.save(diary);
       assertEquals(1, repository.count());
       Diary savedDiary = repository.findById("clinton");
       assertEquals("clinton", savedDiary.getUsername());
    }

    @Test
    public void iAddTwoEntriesToRepository_RepositoryHasTwoEntries_test(){
        Diary diary = new Diary("clinton", "password");
        repository.save(diary);
        Diary diary1 = new Diary("clinton2", "password");
        repository.save(diary1);
        assertEquals(2, repository.count());
    }

    @Test
    public void iAddTwoEntriesToRepository_iDeleteOne_repositoryIsNotEmpty_test(){
        Diary diary = new Diary("clinton", "password");
        repository.save(diary);
        Diary diary1 = new Diary("clinton2", "password");
        repository.save(diary1);
        assertEquals(2, repository.count());
        repository.delete(diary1);
        assertEquals(1, repository.count());
    }

    @Test
    public void i_canSearchEntriesById(){
        Diary diary = new Diary("clinton", "password");
        repository.save(diary);
        Diary diary1 = new Diary("clinton2", "password");
        repository.save(diary1);
        assertEquals(2, repository.count());
        Diary newDiary = repository.findById("clinton2");
        System.out.println(newDiary);
        assertEquals(newDiary, diary1);
    }

    @Test
    public void i_CanDeleteExistingRepository_fromDiary(){
        assertEquals(0, repository.count());
        Diary diary = new Diary("clinton", "password");
        repository.save(diary);
        Diary diary1 = new Diary("clinton2", "password");
        repository.save(diary1);
        assertEquals(2, repository.count());
        repository.delete(diary);
        assertEquals(1, repository.count());
    }
}