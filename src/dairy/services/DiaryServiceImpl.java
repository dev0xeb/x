package dairy.services;

import dairy.data.models.Diary;
import dairy.data.repositories.DiaryRepository;
import dairy.data.repositories.DiaryRepositoryImpl;

public class DiaryServiceImpl implements DiaryService {
    private DiaryRepository diaryRepository = new DiaryRepositoryImpl();
    private int count;

    public DiaryServiceImpl() {

    }
    @Override
    public String register(String username, String password) {
        Diary checkUsername = diaryRepository.findById(username.toLowerCase());
        if (checkUsername != null) {
            throw new IllegalArgumentException("Username is already in use");
        } else {
            Diary newDiary = new Diary();
            newDiary.setUsername(username.toLowerCase());
            newDiary.setPassword(password);
            diaryRepository.save(newDiary);
            count++;
            return "Diary registered successfully";
        }
    }

    @Override
    public String login(String username, String password) {
        return "";
    }

    @Override
    public int count() {
        return count;
    }
}
