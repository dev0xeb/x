package dairy.services;
import dairy.data.models.Diary;
import dairy.data.repositories.DiaryRepository;
import dairy.data.repositories.DiaryRepositoryImpl;

public interface DiaryService {
    String register(String username, String password);
    String login(String username, String password);
    int count();

    boolean isLoggedIn();
//    void validatePassword(String username, String password);
//    public boolean isLoggedIn();
//    public boolean isRegistered();
//    public void deleteDiary(String clinton, String password);
}
