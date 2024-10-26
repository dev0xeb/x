package dairy.data.repositories;

import dairy.data.models.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private int numberOfEntries;
    private static List<Diary> diaries = new ArrayList<>();

    @Override
    public Diary save(Diary diary) {
        diaries.add(diary);
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
    public void delete(Diary username) {
        for (int index = 0; index < diaries.size(); index++) {
            if(diaries.get(index).equals(username)) {
                diaries.remove(index);
            }
        }
        numberOfEntries--;
    }

    @Override
    public long count() {
        return numberOfEntries;
    }

    @Override
    public Diary findById(String username) {
        for(Diary diary : diaries) {
            if(diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }
}
