package dairy.data.repositories;

import dairy.data.models.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private static List<Diary> entries = new ArrayList<>();

    @Override
    public Diary save(Diary diary) {
        entries.add(diary);
        return diary;
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return List.of();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(Diary diary) {

    }

    @Override
    public long count() {
        return entries.size();
    }

    @Override
    public Diary findById() {
        return null;
    }
}
