import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LevelSystemTest {

    private LevelSystem level;

    @BeforeEach
    void setup(){
        level = new LevelSystem();
    }

   @Test
    void levelFromXp1(){
       assertEquals(1,level.levelFromXp(0));
       assertEquals(1,level.levelFromXp(99));
   }

    @Test
    void levelFromXp2(){
        assertEquals(2,level.levelFromXp(100));
        assertEquals(2,level.levelFromXp(249));
        //assertEquals(2,level.levelFromXp(250));
    }

    @Test
    void levelFromXp3(){
        assertEquals(3,level.levelFromXp(499));
        assertEquals(3,level.levelFromXp(498));
    }

    @Test
    void levelFromXp4(){
        assertEquals(4,level.levelFromXp(899));
        assertEquals(4,level.levelFromXp(898));
    }


    @Test
    void go(){
        assertThrows(IllegalArgumentException.class , () -> {
            level.levelFromXp(-1);
        });
    }
}
