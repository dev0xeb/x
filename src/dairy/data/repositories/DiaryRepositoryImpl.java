package dairy.data.repositories;

import dairy.data.models.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private List<Diary> diaries;

    public DiaryRepositoryImpl() {
        this.diaries = new ArrayList<Diary>();
    }
    @Override
    public void save(Diary diary) {
        diaries.add(diary);
        diaries.size();
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return List.of();
    }

    @Override
    public void deleteById(Diary diary) {
        for(int index = 0; index < diaries.size(); index++) {
            Diary currentDiary = diaries.get(index);
            if (currentDiary.getUsername().equals(diary.getUsername())) {
                diaries.remove(index);
            }
        }
    }

    @Override
    public void deleteById(String id) {
        for(int index = 0; index < diaries.size(); index++) {
            Diary currentDiary = diaries.get(index);
            if(currentDiary.getUsername().equals(id)) {
                diaries.remove(index);
            }
        }
    }

    @Override
    public boolean existsById(String id) {
        for (Diary currentDiary : diaries) {
            if (currentDiary.getUsername().equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public long count() {
        return diaries.size();
    }

    @Override
    public Diary findById(String username) {
        for (Diary diary : diaries) {
            if (diary.getUsername().equals(username)) {
                return diary;
            }
        }
        return null;
    }

    @Override
    public void deleteAll() {
        diaries.clear();
    }
}
