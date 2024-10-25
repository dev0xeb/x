package dairy.data.repositories;

import dairy.data.models.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private int numberOfEntries;
    private static List<Diary> entries = new ArrayList<>();

    @Override
    public Diary save(Diary diary) {
        entries.add(diary);
        numberOfEntries++;
        return diary;
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return null;
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void delete(Diary diary) {

    }

    @Override
    public long count() {
        return numberOfEntries;
    }

    @Override
    public Diary findById(String username) {
        for(Diary diary : entries) {
            if(diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }
}
