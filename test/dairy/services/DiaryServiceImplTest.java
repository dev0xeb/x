package dairy.services;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServiceImplTest {
    DiaryServiceImpl diaryService =  new DiaryServiceImpl();

    @BeforeEach
    public void setUp(){
        diaryService = new DiaryServiceImpl();
    }

    @Test
    public void testToRegisterAUser(){
        diaryService.register("clinton", "password");
        assertEquals(1, diaryService.count());
    }

    @Test
    public void  testNotToRegisterAUserThatHasBeenRegistered(){
        diaryService.register("clinton", "password");
        assertEquals(1, diaryService.count());
        assertThrows(IllegalArgumentException.class, ()->diaryService.register("clinton", "password"));
    }

    @Test
    public void testLoginWithCorrectPassword(){
        diaryService.register("clinton", "password");
        assertEquals(1, diaryService.count());
        diaryService.login("clinton", "password");
        assertTrue(diaryService.isLoggedIn());
    }

    @Test
    public void testLoginWithIncorrectPassword(){
        diaryService.register("clinton", "password");
        assertEquals(1, diaryService.count());
        assertThrows(IllegalArgumentException.class, ()->diaryService.login("clinton", "wrongpassword"));
    }

    @Test
    public void testLoginWithIncorrectUsername(){
        diaryService.register("clinton", "password");
        assertEquals(1, diaryService.count());
        assertThrows(IllegalArgumentException.class, ()->diaryService.login("clinton", "wrongpassword"));
    }

    @Test
    public void testCannotLoginUnregisteredUser(){
        diaryService.register("clinton", "password");
        assertEquals(1, diaryService.count());
        assertThrows(IllegalArgumentException.class, ()->diaryService.login("clinton4", "password"));
    }
}