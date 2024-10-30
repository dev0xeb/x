package dairy.data.repositories;

import dairy.data.models.Diary;

import java.util.ArrayList;
import java.util.List;

public class DiaryRepositoryImpl implements DiaryRepository {
    private List<Diary> diaries;
    private int count;

    public DiaryRepositoryImpl() {
        this.diaries = new ArrayList<Diary>();
    }
    @Override
    public void save(Diary diary) {
        diaries.add(diary);
        count++;
    }

    @Override
    public List<Diary> findByTitle(String title) {
        return List.of();
    }

    @Override
    public void delete(Diary diary) {
        for(int index = 0; index < diaries.size(); index++) {
            Diary currentDiary = diaries.get(index);
            if (currentDiary.getUsername().equals(diary.getUsername())) {
                diaries.remove(index);
                count--;
            }
        }
    }

    @Override
    public void delete(String id) {
        for(int index = 0; index < diaries.size(); index++) {
            Diary currentDiary = diaries.get(index);
            if(currentDiary.getUsername().equals(id)) {
                diaries.remove(index);
                count--;
            }
        }
    }

    @Override
    public long count() {
        return count;
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
}
