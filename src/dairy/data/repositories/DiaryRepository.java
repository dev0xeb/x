package dairy.data.repositories;

import dairy.data.models.Diary;

import java.util.List;

public interface DiaryRepository {
    void save(Diary diary);
    List<Diary> findByTitle(String title);
    void deleteById(Diary diary);
    void deleteById(String id);
    boolean existsById(String id);
    long count();
    Diary findById(String username);
    void deleteAll();
}
