package dairy.services;

import dairy.data.models.Diary;
import dairy.data.repositories.DiaryRepository;
import dairy.data.repositories.DiaryRepositoryImpl;

 public class DiaryServiceImpl implements DiaryService {
     private DiaryRepository diaryRepository = new DiaryRepositoryImpl();
     private  int count;
     private boolean isLoggedIn;
     @Override
     public String register(String username, String password) {
         Diary existingUser = diaryRepository.findById(username.toLowerCase());
         if (existingUser != null) {
             throw new IllegalArgumentException("User already exist");
         }
         Diary diary = new Diary(username.toLowerCase(), password);
         diaryRepository.save(diary);
         count++;
         return "User successfully registered";
     }

     @Override
     public String login(String username, String password) {
         Diary existingUser = diaryRepository.findById(username.toLowerCase());
         if (existingUser == null ) {
             throw new IllegalArgumentException("Username not found");
         }
         if(!existingUser.getPassword().equals(password)){
             throw new IllegalArgumentException("Username or pasword is incorrect");
         }
         isLoggedIn = true;
         return "User successfully logged in";
     }


 @Override
     public int count() {
         return count;
     }

     @Override
     public boolean isLoggedIn() {
         return true;
     }

//    @Override
//    public int count() {
//        return 0;
//    }
}
