package dairy.services;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryServiceImplTest {
    DiaryService diaryService = new DiaryServiceImpl();
    @BeforeEach
    public void setUp() {
        diaryService = new DiaryServiceImpl();
    }

    @Test
    public void testCanRegisterNewUser(){
        diaryService.register("clinton2", "password");
        assertEquals(1, diaryService.count());
    }

    @Test
    public void registerNewUserTwiceUserCountIsStillOne(){
        diaryService.register("clinton", "password");
        assertEquals(1, diaryService.count());
        assertThrows(IllegalArgumentException.class, () -> diaryService.register("clinton", "password"));
        assertEquals(1, diaryService.count());
    }

}